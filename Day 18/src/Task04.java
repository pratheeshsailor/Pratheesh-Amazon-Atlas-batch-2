import java.util.*;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers separated by commas:");
        String input = sc.nextLine();

        // Split the input string into individual number strings
        String[] parts = input.split(",");

        // Lists to hold grouped numbers
        ArrayList<Integer> group0 = new ArrayList<>();
        ArrayList<Integer> group1 = new ArrayList<>();
        ArrayList<Integer> group5 = new ArrayList<>();

        // Process each number
        for (String part : parts) {
            part = part.trim(); // Remove spaces
            if (!part.isEmpty()) {
                int num = Integer.parseInt(part);
                int unitDigit = num % 10;

                if (unitDigit == 0) {
                    group0.add(num);
                } else if (unitDigit == 1) {
                    group1.add(num);
                } else if (unitDigit == 5) {
                    group5.add(num);
                }
            }
        }

        // Display results
        System.out.println("Array 1 has : " + group0);
        System.out.println("Array 2 has : " + group1);
        System.out.println("Array 3 has : " + group5);
    }
}
