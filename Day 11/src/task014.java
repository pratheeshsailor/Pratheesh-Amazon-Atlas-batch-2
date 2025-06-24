import java.util.*;

public class task014 {
    public static void main(String[] args) {

        // Create a List of full names
        List<String> friends = new ArrayList<>();
        friends.add("Alice, Johnson");
        friends.add("Alice, sachin");
        friends.add("Bob, Smith");
        friends.add("Charlie, Brown");
        friends.add("Diana, Miller");
        friends.add("Alice, dravid");
        friends.add("Ethan, Davis");

        System.out.println("Friends whose name starts with 'Alice':");

        // Filter, convert to uppercase, sort, and print using Stream API
        friends.stream()
                .filter(name -> name.startsWith("Alice"))       // Filter names starting with "Alice"
                .map(String::toUpperCase)                      // Convert to uppercase
                .sorted()                                      // Sort alphabetically
                .forEach(System.out::println);                 // Print each name
    }
}
