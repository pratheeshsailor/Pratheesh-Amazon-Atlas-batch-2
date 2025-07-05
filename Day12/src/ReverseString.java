import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string using a loop
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);  // Append characters in reverse order
        }

        // Display the reversed string
        System.out.println("Reversed String: " + reversed);

        scanner.close();  // Close the scanner
    }
}