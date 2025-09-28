package Singleaddremovedone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DManager manager = DManager.getInstance();

        // Phase 1: Adding items
        System.out.println("Enter items (type 'Done' to finish adding):");
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("Done")) {
            manager.addItem(input);
        }

        // Phase 2: Removing items
        System.out.println("Enter items to remove (type 'Done' to finish removing):");
        while (!(input = scanner.nextLine()).equalsIgnoreCase("Done")) {
            manager.removeItem(input);
        }

        // Phase 3: Final output
        System.out.println("\nFinal List:");
        for (String item : manager.getList()) {
            System.out.println(item);
        }

        scanner.close();
    }
}
