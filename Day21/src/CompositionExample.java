class Wheel {
    public Wheel() {
        System.out.println("Wheel created");
    }
}

class Car3 {
    private Wheel[] wheels;

    public Car3() {
        // Car3 creates and owns wheels
        wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel();
        }
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Car3 myCar3 = new Car3();

    }
}
