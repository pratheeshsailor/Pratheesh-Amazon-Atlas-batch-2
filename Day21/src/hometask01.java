import java.util.ArrayList;
import java.util.List;

class Animal {
    void sound() {
        System.out.println("Sounds of different animals");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow is the sound of cat");
    }
}

public class hometask01 {
    public static void main(String[] args) {
        // Invariance: List<Cat> is NOT a subtype of List<Animal>
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());

        // List<Animal> animals = catList; // Compile Error!

        // Using unbounded wildcard
        List<?> unknownList = catList;
        Object obj = unknownList.get(0); // Allowed
        System.out.println("Object from unknownList: " + obj.getClass().getSimpleName());

        // Using upper bounded wildcard: List of unknown subtype of Animal
        List<? extends Animal> animalsExtends = catList;
        Animal a = animalsExtends.get(0);  // Allowed to read as Animal
        a.sound();
        // animalsExtends.add(new Cat());  // Compile Error: can't add

        // Using lower bounded wildcard: List of some supertype of Cat
        List<? super Cat> animalsSuper = new ArrayList<Animal>();
        animalsSuper.add(new Cat()); // Allowed to add Cat
        // Animal an = animalsSuper.get(0); // Compile Error: can't safely read as Animal
        Object o = animalsSuper.get(0); // Can read as Object
        System.out.println("Object from animalsSuper: " + o);
    }
}

