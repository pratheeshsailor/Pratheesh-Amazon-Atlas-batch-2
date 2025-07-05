import java.util.HashMap;
import java.util.Map;

public class task013HashMap {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        // Add key-value pairs
        hm.put("Pratheesh", 101);
        hm.put("bala", 102);
        hm.put("allwin", 103);

//        // Access values using get()
//        System.out.println("Using get() method:");
//        System.out.println("Pratheesh ID: " + hm.get("Pratheesh"));
//        System.out.println("bala ID: " + hm.get("bala"));
//        System.out.println("allwin ID: " + hm.get("allwin"));

        // Or use entrySet() to loop over all key-value pairs
        System.out.println("\nUsing entrySet():");
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
