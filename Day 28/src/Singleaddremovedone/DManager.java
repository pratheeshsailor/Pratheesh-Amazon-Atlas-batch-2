package Singleaddremovedone;


import java.util.ArrayList;
import java.util.List;

public class DManager {
    private static DManager instance;
    private List<String> itemList;

    // Private constructor for Singleton
    private DManager() {
        if (instance != null) {
            throw new IllegalStateException("Instance already exists! Use getInstance().");
        }
        itemList = new ArrayList<>();
    }

    // Public static synchronized getInstance()
    public static synchronized DManager getInstance() {
        if (instance == null) {
            instance = new DManager();
        }
        return instance;
    }

    // Thread-safe methods
    public synchronized void addItem(String item) {
        itemList.add(item);
    }

    public synchronized void removeItem(String item) {
        itemList.remove(item);
    }

    public synchronized List<String> getList() {
        return new ArrayList<>(itemList); // return copy
    }
}
