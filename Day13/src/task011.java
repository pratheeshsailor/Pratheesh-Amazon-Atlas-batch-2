import java.util.LinkedList;
import java.util.Arrays;

public class task011 {
    public static void main(String[] args) {
        // Create and populate the LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Convert LinkedList to array
        Object[] fruitArray = fruits.toArray();
        System.out.println(Arrays.toString(fruitArray));

        // Display the array elements
        System.out.println("Elements in array form:");
        for (Object fruit : fruitArray) {
            System.out.println(fruit);
        }
    }
}

