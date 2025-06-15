import java.util.*;

class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        // add(Object o)
        al.add("Apple");
        al.add("Banana");
        System.out.println("1. add: " + al); // [Apple, Banana]

        // addAll(Collection C)
        List<String> moreFruits = Arrays.asList("Cherry", "Date");
        al.addAll(moreFruits);
        System.out.println("2. addAll: " + al); // [Apple, Banana, Cherry, Date]

        // addAll(int index, Collection C)
        List<String> topFruits = Arrays.asList("Elderberry", "Fig");
        al.addAll(1, topFruits);
        System.out.println("3. addAll(index, Collection): " + al); // [Apple, Elderberry, Fig, Banana, Cherry, Date]

        // clear()
        ArrayList<String> temp = new ArrayList<>(al); // Copy for later
        temp.clear();
        System.out.println("4. clear: " + temp); // []

        // clone()
        ArrayList<String> cloneList = (ArrayList<String>) al.clone();
        System.out.println("5. clone: " + cloneList);

        // contains(Object o)
        boolean hasApple = al.contains("Apple");
        System.out.println("6. contains 'Apple': " + hasApple); // true

        // ensureCapacity(int minCapacity)
        al.ensureCapacity(20); // Ensures internal capacity (no visible output)

        // forEach(Consumer<? super E> action)
        System.out.print("7. forEach: ");
        al.forEach(item -> System.out.print(item + " | "));
        System.out.println();

        // get(int index)
        System.out.println("8. get index 2: " + al.get(2)); // Fig
    }
}

