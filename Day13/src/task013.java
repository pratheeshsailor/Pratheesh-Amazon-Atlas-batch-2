import java.util.LinkedList;

public class task013 {
    public static void main(String[] args) {
        // Create and populate a LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Original List: " +fruits);
        // Use push() to add an element at the front (like stack)
        fruits.push("Apple"); // Same as addFirst()

        System.out.println("After push: " + fruits); // [Apple, Banana, Mango, Orange]

        // Use pop() to remove the first element (like stack)
        String popped = fruits.pop(); // Removes "Apple"

        System.out.println("Popped element: " + popped);
        System.out.println("After pop: " + fruits); // [Banana, Mango, Orange]
    }
}
