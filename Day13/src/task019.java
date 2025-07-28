import java.util.HashMap;

public class task019 {
    public static void main(String[] args) {
        // Create HashMap with initial capacity 10 and load factor 0.75
        HashMap<String, Integer> hm = new HashMap<String, Integer>(10, 0.75f);

        // Calculate threshold
        int initialCapacity = 10;
        float loadFactor = 0.75f;
        int threshold = (int)(initialCapacity * loadFactor);

        System.out.println("Initial Configuration:");
        System.out.println("Initial Capacity: " + initialCapacity);
        System.out.println("Load Factor: " + loadFactor);
        System.out.println("Threshold before rehashing: " + threshold);

        // Adding elements to HashMap
        System.out.println("\nAdding elements to HashMap:");

        hm.put("One", 1);
        System.out.println("Added One: " + hm.size() + " elements");

        hm.put("Two", 2);
        System.out.println("Added Two: " + hm.size() + " elements");

        hm.put("Three", 3);
        System.out.println("Added Three: " + hm.size() + " elements");

        hm.put("Four", 4);
        System.out.println("Added Four: " + hm.size() + " elements");

        hm.put("Five", 5);
        System.out.println("Added Five: " + hm.size() + " elements");

        hm.put("Six", 6);
        System.out.println("Added Six: " + hm.size() + " elements");

        hm.put("Seven", 7);
        System.out.println("Added Seven: " + hm.size() + " elements");

        // After threshold (7.5), HashMap will rehash
        hm.put("Eight", 8);
        System.out.println("Added Eight: " + hm.size() + " elements (Rehashing may occur)");

        // Display final HashMap
        System.out.println("\nFinal HashMap contents:");
        for(String key : hm.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hm.get(key));
        }

        // HashMap operations
        System.out.println("\nHashMap Operations:");
        System.out.println("Size of HashMap: " + hm.size());
        System.out.println("Contains key 'Three'? " + hm.containsKey("Three"));
        System.out.println("Value for key 'Four': " + hm.get("Four"));
    }
}