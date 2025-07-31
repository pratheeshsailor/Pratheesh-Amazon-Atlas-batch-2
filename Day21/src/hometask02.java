import java.util.ArrayList;
import java.util.List;

class Animal1 {
    @Override
    public String toString() {
        return "Animal1";
    }
}

class Cat1 extends Animal1 {
    @Override
    public String toString() {
        return "Cat1";
    }
}

public class hometask02 {
    // Method that accepts a list of any type using unbounded wildcard
    static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<Cat1> Cat1List = new ArrayList<>();
        Cat1List.add(new Cat1());

        printList(Cat1List);  // Prints: Cat1
    }
}
