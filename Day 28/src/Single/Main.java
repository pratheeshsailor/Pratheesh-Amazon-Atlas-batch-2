package single;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DManager manager = DManager.getInstance();

        System.out.println("Enter items (type 'Done' to finish):");

        // Step 1: Input until Done
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("Done")) {
            manager.addItem(input);
        }

        // Step 2: Ask which item to remove
        System.out.println("Enter an item to remove:");
        String itemToRemove = scanner.nextLine();
        manager.removeItem(itemToRemove);

        // Step 3: Show final list
        System.out.println("\nFinal List:");
        for (String item : manager.getList()) {
            System.out.println(item);
        }

        scanner.close();
    }
}
