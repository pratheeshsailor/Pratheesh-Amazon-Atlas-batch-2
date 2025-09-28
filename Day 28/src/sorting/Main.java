package sorting;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataManager dataManager = new DataManager(new AlphabeticalSort());
        String input;
        while (!((input = scanner.nextLine()).equalsIgnoreCase("done"))) {
            dataManager.addItem(input);
        }
        dataManager.performSort();
        System.out.println("Sorted by alphabet:");
        List<String> sortedList = dataManager.getList();
        for (String item : sortedList) {
            System.out.println(item);
        }
        dataManager.setSortingStrategy(new LengthSort());
        dataManager.performSort();
        System.out.println("Sorted by length:");
        for (String item : dataManager.getList()) {
            System.out.println(item);
        }
        scanner.close();
    }
}

