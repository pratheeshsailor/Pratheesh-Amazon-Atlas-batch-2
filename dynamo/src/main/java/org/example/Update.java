package org.example;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Update {
    public static void main(String[] args) {
        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8001")) // DynamoDB local
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(
                        StaticCredentialsProvider.create(
                                AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey")
                        )
                )
                .build();

        String tableName = "Employees01";

        // Create item
        Map<String, AttributeValue> item = new HashMap<>();
        item.put("ID", AttributeValue.builder().n("1001").build());
        item.put("Name", AttributeValue.builder().s("Pratheesh").build());
        item.put("Address", AttributeValue.builder().s("USA").build());
        item.put("NomenClature", AttributeValue.builder().s("Clothes 100").build());

        PutItemRequest putRequest = PutItemRequest.builder()
                .tableName(tableName)
                .item(item)
                .build();

        client.putItem(putRequest);

        System.out.println("Item inserted successfully!");
        client.close();
    }
}
