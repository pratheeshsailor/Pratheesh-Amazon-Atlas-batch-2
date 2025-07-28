import java.util.LinkedList;

public class task07 {
    public static void main(String[] args) {
        // Create LinkedList of strings
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Display the list
        System.out.println("Fruits List: " + fruits);
        System.out.println("Frist elment in list: " + fruits.getLast());
        System.out.println("last elment in list: " + fruits.getFirst());

        // Add at first and last
        fruits.addFirst("Pineapple");
        fruits.addLast("Grapes");

        System.out.println("After adding first and last: " + fruits);

        // Removing the first element
        fruits.removeFirst();

        // Removing the last element
        fruits.removeLast();

        // Displaying the updated LinkedList
        System.out.println("After removing first and last: " + fruits);
    }
}
