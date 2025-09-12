package org.example;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.DeleteItemRequest;
import software.amazon.awssdk.services.dynamodb.model.GetItemRequest;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class DeleteItemExample {
    public static void main(String[] args) {

        // 1. Create DynamoDB client
        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8001")) // DynamoDB local
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(StaticCredentialsProvider.create(
                        AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey")
                ))
                .build();

        String tableName = "Employees02";

        // 2. Define primary key of the item to delete
        Map<String, AttributeValue> key = new HashMap<>();
        key.put("ID", AttributeValue.builder().n("1004").build());

        // 3. Build DeleteItemRequest
        DeleteItemRequest deleteRequest = DeleteItemRequest.builder()
                .tableName(tableName)
                .key(key)
                .build();

        // 4. Perform delete
        client.deleteItem(deleteRequest);
        System.out.println("Item deleted successfully!");

        // 5. Try to fetch the item to verify
        GetItemRequest getRequest = GetItemRequest.builder()
                .tableName(tableName)
                .key(key)
                .build();

        Map<String, AttributeValue> deletedItem = client.getItem(getRequest).item();

        if (deletedItem == null || deletedItem.isEmpty()) {
            System.out.println("Verified: Item no longer exists in table.");
        } else {
            System.out.println("Delete failed, item still exists: " + deletedItem);
        }

        client.close();
    }
}
