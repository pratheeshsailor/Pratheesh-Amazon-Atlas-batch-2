import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList02 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Bob"); // duplicate
        names.add("Eve");

        System.out.println("Original List: " + names);

        // indexOf(Object o)
        int index1 = names.indexOf("Bob");
        System.out.println("1. First index of 'Bob': " + index1);  // 1

        // isEmpty()
        System.out.println("2. Is the list empty? " + names.isEmpty());  // false

        // lastIndexOf(Object o)
        int lastIndex = names.lastIndexOf("Bob");
        System.out.println("3. Last index of 'Bob': " + lastIndex);  // 3

        // listIterator()
        System.out.print("4. Iterating using listIterator(): ");
        ListIterator<String> it = names.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " | ");
        }
        System.out.println();

        // listIterator(int index)
        System.out.print("5. Iterating from index 2: ");
        ListIterator<String> itFrom2 = names.listIterator(2);
        while (itFrom2.hasNext()) {
            System.out.print(itFrom2.next() + " | ");
        }
        System.out.println();

        // remove(int index)
        names.remove(2);  // Removes "Charlie"
        System.out.println("6. List after removing index 2: " + names);
    }
}

