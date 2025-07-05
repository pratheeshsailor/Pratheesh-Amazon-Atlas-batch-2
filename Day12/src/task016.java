import java.util.HashMap;

public class task016 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // Add entries
        map.put("A", "Apple");
        map.put("B", "Banana");

        // Add null key
        map.put(null, "NullKeyValue");

        // Add another value for null key (overwrites)
        map.put(null, "UpdatedNullKey");

        // Add null values
        map.put("C", null);
        map.put("C", "grape");

        // Print map
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + " → Value: " + map.get(key));
        }
    }
}
