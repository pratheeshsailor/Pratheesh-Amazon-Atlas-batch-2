package org.example;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// loading data to the table created
public class Demo02 {
    public static void main(String[] args) throws Exception {
        System.out.println("loading data to table...");

        // Fake credentials for local DynamoDB
        AwsBasicCredentials awsCreds = AwsBasicCredentials.create("fakeAccesskey", "fakeSecretKey");

        // Connect to DynamoDB Local running on port 8001
        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8001"))
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
                .build();

        String tableName = "Employees01";

        // Load JSON from resources
        ObjectMapper mapper = new ObjectMapper();
        InputStream jsonStream = Demo02.class.getClassLoader().getResourceAsStream("Employee.json");

        if (jsonStream == null) {
            System.err.println("❌ Could not find Employee.json in resources!");
            System.exit(1);
        }

        JsonNode rootNode = mapper.readTree(jsonStream);
        Iterator<JsonNode> iterator = rootNode.elements();

        // Insert records into DynamoDB
        while (iterator.hasNext()) {
            JsonNode node = iterator.next();
            Map<String, AttributeValue> item = new HashMap<>();
            item.put("ID", AttributeValue.builder().n(node.get("ID").asText()).build());
            item.put("Name", AttributeValue.builder().s(node.get("Name").asText()).build());
            item.put("Address", AttributeValue.builder().s(node.get("Address").asText()).build());

            PutItemRequest putRequest = PutItemRequest.builder()
                    .tableName(tableName)
                    .item(item)
                    .build();

            client.putItem(putRequest);

            System.out.printf("✔ Inserted: ID=%d | Name=%s | Address=%s%n",
                    node.get("ID").asInt(),
                    node.get("Name").asText(),
                    node.get("Address").asText());
        }

        client.close();
        System.out.println("✅ All records inserted successfully.");
    }
}
