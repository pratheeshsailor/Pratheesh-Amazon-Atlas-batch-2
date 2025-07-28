import java.util.HashMap;

public class task018 {
    public static void main(String[] args) {
        // Original map
        HashMap<String, Integer> hm2 = new HashMap<>();
        hm2.put("Apple", 10);
        hm2.put("Banana", 20);
        hm2.put("Mango", 30);

        // Copy data from hm2 to hm3 using constructor
        HashMap<String, Integer> hm3 = new HashMap<>(hm2);

        // Display the copied map
        System.out.println("Original Map (hm2): " + hm2);
        System.out.println("Copied Map   (hm3): " + hm3);
    }
}
