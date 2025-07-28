import java.util.LinkedList;

public class task012 {
    public static void main(String[] args) {
        // Create and populate the original LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Clone the LinkedList
        LinkedList<String> clonedList = (LinkedList<String>) fruits.clone();

        // Display original and cloned lists
        System.out.println("Original LinkedList: " + fruits);
        System.out.println("Cloned LinkedList:   " + clonedList);
        System.out.println("Same object? " + (fruits == clonedList));
    }
}

