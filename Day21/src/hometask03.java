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

public class hometask03 {
    // Upper bounded wildcard: accepts list of Animal or any subclass
    static void animalSound(List<? extends Animal> animalList) {
        for (Animal element : animalList) {
            element.sound();
        }
    }

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        animalSound(cats);  // Output: Meow is the sound of cat
    }
}
