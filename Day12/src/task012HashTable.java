//import java.util.Hashtable;
//import java.util.Map;
//
//public class task012HashTable {
//    public static void main(String[] args) {
//        Hashtable<String, Integer> ht = new Hashtable<>();
//        ht.put("Pratheesh", 101);
//        ht.put("bala", 102);
//        ht.put("allwin", 103);
//        ht.put("sarath", 103);
//        // use  get method of Ht
//        for (Map.Entry<String, Integer> e : ht.entrySet())
//            System.out.println(e.getKey() + " " + e.getValue());
//    }
//}

import java.util.Hashtable;
import java.util.Map;

public class task012HashTable {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<String, Integer> ht = new Hashtable<>();

        // Add key-value pairs
        ht.put("Pratheesh", 101);
        ht.put("bala", 102);
        ht.put("allwin", 103);
        ht.put("sarath", 103);
        ht.put(null, 103);

        // Access values using get()
        System.out.println("Using get() method:");
        System.out.println("Pratheesh ID: " + ht.get("Pratheesh"));
        System.out.println("bala ID: " + ht.get("bala"));
        System.out.println("allwin ID: " + ht.get("allwin"));

        // Or use entrySet() to loop over all key-value pairs
        System.out.println("\nUsing entrySet():");
        for (Map.Entry<String, Integer> e : ht.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
