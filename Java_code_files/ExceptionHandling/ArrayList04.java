import java.util.*;

public class ArrayList04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);  // initial capacity 10
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // 1. size()
        System.out.println("1. List size: " + list.size());  // 5

        // 2. spliterator()
        System.out.print("2. Using spliterator(): ");
        Spliterator<String> spl = list.spliterator();
        spl.forEachRemaining(name -> System.out.print(name + " | "));
        System.out.println();

        // 3. subList(fromIndex, toIndex)
        List<String> partial = list.subList(1, 4); // index 1 to 3
        System.out.println("3. Sublist (1 to 4): " + partial);  // [Banana, Cherry, Date]

        // 4. toArray() — returns Object[]
        Object[] arr1 = list.toArray();
        System.out.println("4. toArray(): " + Arrays.toString(arr1));

        // 5. toArray(T[] a) — returns typed array
        String[] arr2 = list.toArray(new String[0]);
        System.out.println("5. toArray(new String[0]): " + Arrays.toString(arr2));

        // 6. trimToSize() — trims capacity to actual size
        System.out.println("Before trimToSize: Capacity is larger than size (not visible, internal only)");
        list.trimToSize(); // Reduces capacity to match current size
        System.out.println("6. trimToSize() called. Capacity now = actual size (5)");
    }
}
