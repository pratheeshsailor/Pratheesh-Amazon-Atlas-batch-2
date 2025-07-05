import java.util.Scanner;
import java.util.Arrays;

public class ReverseArrayUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get size of the array from the user
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Get array elements from the user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Display original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Reverse the array in-place
        reverse(arr);

        // Display reversed array
        System.out.println("Reversed array: " + Arrays.toString(arr));

        scanner.close();
    }

    // Function to reverse the array
    public static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
