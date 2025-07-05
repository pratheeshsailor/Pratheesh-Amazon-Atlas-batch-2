import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class task017 {
    public static void main(String[] args) {
        // Create a normal HashMap
        Map<String, String> map = new HashMap<>();

        // Make it synchronized
        Map<String, String> syncMap = Collections.synchronizedMap(map);

        // Use synchronized map
        syncMap.put("A", "Apple");
        syncMap.put("B", "Banana");
        syncMap.put(null, "Banana");
        syncMap.put(null, "NullKey");  // Still allows null key

        // Access within synchronized block if doing iteration in multi-threaded context
        synchronized (syncMap) {
            for (Map.Entry<String, String> entry : syncMap.entrySet()) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }
        }
    }
}
