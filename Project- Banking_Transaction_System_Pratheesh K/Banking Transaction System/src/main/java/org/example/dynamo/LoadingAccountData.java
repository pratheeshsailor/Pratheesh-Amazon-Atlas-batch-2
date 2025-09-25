package org.example.dynamo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LoadingAccountData {

    private static final String TABLE_NAME = "Account";

    public static void main(String[] args) throws Exception {
        AwsBasicCredentials awsCreds = AwsBasicCredentials.create("fakeaccess", "fakeaccess");

        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8001")) // DynamoDB Local default
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
                .build();

        System.out.println("✅ Connected to DynamoDB");

        // Ensure the table exists
        createAccountTableIfNotExists(client);

        // Load JSON
        ObjectMapper mapper = new ObjectMapper();
        InputStream stream = LoadingAccountData.class.getClassLoader().getResourceAsStream("Account.json");
        if (stream == null) {
            System.out.println("❌ Account.json file not found!");
            client.close();
            return;
        }

        JsonNode rootNode = mapper.readTree(stream);
        Iterator<JsonNode> iterator = rootNode.elements();

        while (iterator.hasNext()) {
            JsonNode node = iterator.next();
            Map<String, AttributeValue> item = new HashMap<>();

            item.put("AccountID", stringNode(node, "AccountID"));
            item.put("CustomerID", stringNode(node, "CustomerID"));
            item.put("AccountType", stringNode(node, "AccountType"));
            item.put("Balance", numberNode(node, "Balance"));

            client.putItem(PutItemRequest.builder()
                    .tableName(TABLE_NAME)
                    .item(item)
                    .build());
        }

        client.close();
        System.out.println("🔒 All data loaded and connection closed");
    }

    private static void createAccountTableIfNotExists(DynamoDbClient client) {
        try {
            client.describeTable(DescribeTableRequest.builder().tableName(TABLE_NAME).build());
            System.out.println("Table already exists.");
        } catch (ResourceNotFoundException e) {
            client.createTable(CreateTableRequest.builder()
                    .tableName(TABLE_NAME)
                    .attributeDefinitions(
                            AttributeDefinition.builder()
                                    .attributeName("AccountID")
                                    .attributeType(ScalarAttributeType.S)
                                    .build())
                    .keySchema(
                            KeySchemaElement.builder()
                                    .attributeName("AccountID")
                                    .keyType(KeyType.HASH)
                                    .build())
                    .provisionedThroughput(ProvisionedThroughput.builder()
                            .readCapacityUnits(5L)
                            .writeCapacityUnits(5L)
                            .build())
                    .build());
            System.out.println("✅ Account table created.");
        }
    }

    private static AttributeValue stringNode(JsonNode node, String field) {
        return AttributeValue.builder()
                .s(node.has(field) ? node.get(field).asText() : "")
                .build();
    }

    private static AttributeValue numberNode(JsonNode node, String field) {
        return AttributeValue.builder()
                .n(node.has(field) ? node.get(field).asText() : "0")
                .build();
    }
}
