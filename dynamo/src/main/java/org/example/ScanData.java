package org.example;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.ScanRequest;
import software.amazon.awssdk.services.dynamodb.model.ScanResponse;

import java.net.URI;
import java.util.Map;

public class ScanData {
    public static void main(String[] args) {

        // Create DynamoDB client
        DynamoDbClient client = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8001")) // DynamoDB Local endpoint
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(
                        StaticCredentialsProvider.create(
                                AwsBasicCredentials.create("fakeAccessKey", "fakeSecretKey")
                        )
                )
                .build();

        String tableName = "Employees02"; // replace with your table name

        try {
            // Create a ScanRequest
            ScanRequest scanRequest = ScanRequest.builder()
                    .tableName(tableName)
                    .build();

            // Execute scan
            ScanResponse response = client.scan(scanRequest);

            System.out.println("Scanning data from table: " + tableName);
            for (Map<String, AttributeValue> item : response.items()) {
                // Print each item
                System.out.println("---------------------------");
                item.forEach((key, value) -> {
                    if (value.s() != null) {
                        System.out.println(key + ": " + value.s());
                    } else if (value.n() != null) {
                        System.out.println(key + ": " + value.n());
                    } else {
                        System.out.println(key + ": " + value.toString());
                    }
                });
            }

        } catch (Exception e) {
            System.err.println("Error scanning table: " + e.getMessage());
            e.printStackTrace();
        } finally {
            client.close();
        }
    }
}
