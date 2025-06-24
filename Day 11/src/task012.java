import java.util.ArrayList;

public class task012 {
    public static void main(String[] args) {

        // Create an ArrayList of String type
        ArrayList<String> friends = new ArrayList<>();

        // Add 5 friends' names
        friends.add("Alice");
        friends.add("Bob");
        friends.add("Charlie");
        friends.add("Diana");
        friends.add("Ethan");

        // Print the list
        System.out.println("My Friends:");
        for (String name : friends) {
            System.out.println(name);
        }
    }
}
