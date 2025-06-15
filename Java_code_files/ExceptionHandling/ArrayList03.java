import java.util.*;
import java.util.function.Predicate;

public class ArrayList03 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "Alice", "Bob", "Charlie", "Bob", "David", "Eve", "Bob"
        ));
        System.out.println("Original List: " + names);

        // 1. remove(Object o) — removes first occurrence
        names.remove("Bob");
        System.out.println("1. After remove(\"Bob\"): " + names);

        // 2. removeAll(Collection c)
        ArrayList<String> removeList = new ArrayList<>(Arrays.asList("Charlie", "Eve"));
        names.removeAll(removeList);
        System.out.println("2. After removeAll([Charlie, Eve]): " + names);

        // 3. removeIf(Predicate filter)
        names.removeIf(name -> name.startsWith("D"));
        System.out.println("3. After removeIf(name starts with D): " + names);

        // 4. retainAll(Collection<?> c)
        ArrayList<String> keepList = new ArrayList<>(Arrays.asList("Alice"));
        names.retainAll(keepList);
        System.out.println("4. After retainAll([Alice]): " + names);

        // Reset list
        names.clear();
        names.addAll(Arrays.asList("A", "B", "C", "D", "E"));

        // 5. set(int index, E element)
        names.set(2, "Z"); // Replace "C" with "Z"
        System.out.println("5. After set(2, \"Z\"): " + names);

        // 6. removeRange(int fromIndex, int toIndex)
        // ⚠️ removeRange is **protected** in ArrayList, so not accessible directly.
        // Workaround:
        names.subList(1, 3).clear(); // Removes elements at index 1 and 2
        System.out.println("6. After subList(1,3).clear(): " + names);
    }
}
