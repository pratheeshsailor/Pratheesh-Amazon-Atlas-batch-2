abstract class Bird {
    abstract void fly();
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle flies high in the sky.");
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        // Violation: Ostrich can't fly
        System.out.println("Ostrich can't really fly, but this method is here just to satisfy the abstract method.");
    }
}

public class BirdLSPViolation {
    public static void main(String[] args) {
        Bird b1 = new Eagle();
        Bird b2 = new Ostrich();

        b1.fly(); // OK
        b2.fly(); // Logically incorrect - misleading behavior
    }
}
