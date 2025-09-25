package org.example.dynamo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;

import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LoadingCustomerData {

    public static void main(String[] args) throws Exception {

        // 1. AWS Credentials
        AwsBasicCredentials awsCreds = AwsBasicCredentials.create("fakeaccess", "fakeaccess");

        // 2. DynamoDB client
        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8001")) // Local DynamoDB endpoint
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
                .build();

        System.out.println("✅ Connected to DynamoDB");

        String tableName = "Customer";

        // 3. Load JSON file from resources
        ObjectMapper mapper = new ObjectMapper();
        InputStream stream = LoadingCustomerData.class.getClassLoader()
                .getResourceAsStream("Customer.json");

        if (stream == null) {
            System.out.println("❌ Customer.json file not found in resources!");
            client.close();
            return;
        }

        JsonNode rootNode = mapper.readTree(stream);
        Iterator<JsonNode> iterator = rootNode.elements();

        // 4. Loop through JSON and insert each customer
        while (iterator.hasNext()) {
            JsonNode node = iterator.next();
            Map<String, AttributeValue> item = new HashMap<>();

            item.put("CustomerID", AttributeValue.builder().s(getJsonText(node, "CustomerID")).build());
            item.put("Name", AttributeValue.builder().s(getJsonText(node, "Name")).build());
            item.put("Address", AttributeValue.builder().s(getJsonText(node, "Address")).build());
            item.put("Contact", AttributeValue.builder().s(getJsonText(node, "Contact")).build());
            item.put("Branch", AttributeValue.builder().s(getJsonText(node, "Branch")).build());
            item.put("Email", AttributeValue.builder().s(getJsonText(node, "Email")).build());
            item.put("Password", AttributeValue.builder().s(getJsonText(node, "Password")).build());

            PutItemRequest request = PutItemRequest.builder()
                    .tableName(tableName)
                    .item(item)
                    .build();

            client.putItem(request);
            System.out.println("✅ Inserted CustomerID: " + getJsonText(node, "CustomerID"));
        }

        client.close();
        System.out.println("🔒 All customer data loaded and connection closed");
    }

    // Helper method to safely get JSON text
    private static String getJsonText(JsonNode node, String fieldName) {
        JsonNode valueNode = node.get(fieldName);
        return valueNode != null ? valueNode.asText() : "";
    }
}
