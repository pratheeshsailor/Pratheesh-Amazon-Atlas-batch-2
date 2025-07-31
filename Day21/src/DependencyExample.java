class Engine {
    void start() {
        System.out.println("Engine starting");
    }
}

class Car {
    void drive() {
        Engine engine = new Engine(); // Dependency
        engine.start();
        System.out.println("Car is driving");
    }
}

public class DependencyExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
    }
}
