import java.util.HashMap;

public class task017 {
    public static void main(String[] args) {
        // Creating a HashMap with initial capacity of 10
        HashMap<String, Integer> hm = new HashMap<String, Integer>(10);

        // Adding some elements to the HashMap
        hm.put("One", 1);
        hm.put("Two", 2);
        hm.put("Three", 3);

        // Printing the HashMap
        System.out.println("HashMap with capacity 10: " + hm);

        // You can also check the size of the HashMap
        System.out.println("Current size of HashMap: " + hm.size());
    }
}