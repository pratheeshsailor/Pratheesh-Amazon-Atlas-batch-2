package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
// Strategy interface
interface SortingStrategy {
    void sort(List<String> items);
}
// Concrete strategy: Sort items in alphabetical order (case-insensitive)
class AlphabeticalSort implements SortingStrategy {
    @Override
    public void sort(List<String> items) {
        Collections.sort(items, String.CASE_INSENSITIVE_ORDER);
    }
}
class LengthSort implements SortingStrategy {
    @Override
    public void sort(List<String> items) {
        Collections.sort(items, Comparator
                .comparingInt(String::length)
                .thenComparing(String::toString, String.CASE_INSENSITIVE_ORDER));
    }
}
// Context class
class DataManager {
    private SortingStrategy sortingStrategy;
    private List<String> itemList;
    public DataManager(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
        this.itemList = new ArrayList<>();
    }
    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }
    public void addItem(String item) {
        itemList.add(item);
    }
    public void removeItem(String item) {
        itemList.remove(item);
    }
    public void performSort() {
        if (sortingStrategy != null) {
            sortingStrategy.sort(itemList);
        }
    }
    public List<String> getList() {
        return itemList;
    }
}