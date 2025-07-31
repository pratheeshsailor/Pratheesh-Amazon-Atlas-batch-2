import java.util.ArrayList;
import java.util.List;

class Animal4 {
    void sound() {
        System.out.println("Animal4 makes a sound");
    }
}

class Cat4 extends Animal4 {
    @Override
    void sound() {
        System.out.println("Meow is the sound of Cat4");
    }
}

public class hometask04 {
    // Lower bounded wildcard: accepts Cat4 or any superclass (Animal4, Object)
    static void addACat4(List<? super Cat4> Cat4s) {
        Cat4s.add(new Cat4());  // ✅ Safe to add
        System.out.println("Cat4 added to the list.");
    }

    public static void main(String[] args) {
        List<Animal4> Animal4s = new ArrayList<>();
        addACat4(Animal4s);  // ✅ Works because Animal4 is a supertype of Cat4

        // Show what's inside the list
        for (Animal4 Animal4 : Animal4s) {
            Animal4.sound();  // Output: Meow is the sound of Cat4
        }

        // Also works with List<Object>
        List<Object> objects = new ArrayList<>();
        addACat4(objects);  // ✅ Still valid: Object is a supertype of Cat4
    }
}
