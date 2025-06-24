import java.util.ArrayList;
import java.util.List;

public class task013 {

    // Static list to store full names
    static List<String> fullName = new ArrayList<>();

    public static void main(String[] args) {

        // Add 5 friends' full names
        fullName.add("Alice Johnson");
        fullName.add("Bob Smith");
        fullName.add("Charlie Brown");
        fullName.add("Diana Miller");
        fullName.add("Ethan Davis");

        // Print full names
        System.out.println("List of Friends:");
        for (String name : fullName) {
            System.out.println(name);
        }
    }
}
