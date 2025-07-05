import java.util.Hashtable;
import java.util.Map;
public class task15<Key, Value> {

    private class HashTableNode {
        private Key key;
        private Value value;
        private boolean active;
        private boolean tombstoned; // Marks deleted nodes

        public HashTableNode() {
            key = null;
            value = null;
            active = false;
            tombstoned = false;
        }

        public HashTableNode(Key initKey, Value initValue) {
            key = initKey;
            value = initValue;
            active = true;
            tombstoned = false;
        }
    }

    private final static int TABLE_SIZE = 9;
    private Object[] table;

    public task15() {
        table = new Object[TABLE_SIZE];
        for (int j = 0; j < TABLE_SIZE; j++) {
            table[j] = new HashTableNode();
        }
    }

    // Custom hash function for String keys
    public int hashCode(String s) {
        if (s.length() == 0) return 0;
        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            sum += s.charAt(i) * (int) Math.pow(31, n - i - 1);
        }
        sum += s.charAt(n - 1);
        return Math.abs(sum) % TABLE_SIZE;
    }

    // Generic hash function
    private int hash(Key key) {
        if (key instanceof String) {
            return hashCode((String) key);
        }
        return Math.abs(key.hashCode()) % TABLE_SIZE;
    }

    // PUT method: inserts or updates a key-value pair
    public Value put(Key key, Value value) {
        int index = hash(key);
        int firstTombstone = -1;

        for (int i = 0; i < TABLE_SIZE; i++) {
            int probeIndex = (index + i) % TABLE_SIZE;
            HashTableNode node = (HashTableNode) table[probeIndex];

            if (node.active && node.key.equals(key)) {
                Value oldVal = node.value;
                node.value = value;
                return oldVal;
            }

            if (!node.active) {
                if (node.tombstoned && firstTombstone == -1) {
                    firstTombstone = probeIndex;
                } else if (!node.tombstoned) {
                    if (firstTombstone != -1) {
                        table[firstTombstone] = new HashTableNode(key, value);
                        return null;
                    } else {
                        table[probeIndex] = new HashTableNode(key, value);
                        return null;
                    }
                }
            }
        }

        throw new RuntimeException("Hash table is full");
    }

    // GET method: retrieves a value for a given key
    public Value get(Key key) {
        int index = hash(key);

        for (int i = 0; i < TABLE_SIZE; i++) {
            int probeIndex = (index + i) % TABLE_SIZE;
            HashTableNode node = (HashTableNode) table[probeIndex];

            if (node.active && node.key.equals(key)) {
                return node.value;
            }

            if (!node.active && !node.tombstoned) {
                return null; // Stop search if we hit a truly empty slot
            }
        }

        return null; // Key not found
    }

    // REMOVE method: logically deletes a key
    public boolean remove(Key key) {
        int index = hash(key);

        for (int i = 0; i < TABLE_SIZE; i++) {
            int probeIndex = (index + i) % TABLE_SIZE;
            HashTableNode node = (HashTableNode) table[probeIndex];

            if (node.active && node.key.equals(key)) {
                node.active = false;
                node.tombstoned = true;
                return true;
            }

            if (!node.active && !node.tombstoned) {
                return false; // Stop search if no more relevant nodes
            }
        }

        return false;
    }

    // Print all active key-value pairs
    public void printTable() {
        System.out.println("Hash Table:");
        for (int i = 0; i < TABLE_SIZE; i++) {
            HashTableNode node = (HashTableNode) table[i];
            if (node.active) {
                System.out.println("[" + i + "] " + node.key + " => " + node.value);
            } else if (node.tombstoned) {
                System.out.println("[" + i + "] <Tombstoned>");
            } else {
                System.out.println("[" + i + "] <Empty>");
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        task15<String, Integer> ht = new task15<>();

        ht.put("baab", 246);
        ht.put("abba", 100);
        ht.put("hello", 55);
        ht.put("world", 88);

        ht.printTable();

        System.out.println("\nGet 'abba': " + ht.get("abba"));
        System.out.println("Get 'hello': " + ht.get("hello"));

        ht.remove("hello");
        System.out.println("\nAfter removing 'hello':");
        ht.printTable();

        System.out.println("\nTry to get 'hello' after deletion: " + ht.get("hello"));
    }
}
