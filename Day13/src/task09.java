import java.util.LinkedList;

public class task09 {
    public static void main(String[] args) {
        // Creating and populating LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // 1. Display using get() and for loop
        System.out.println("Displaying using get() and for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // 2. Display using for-each loop
        System.out.println("\nDisplaying using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
