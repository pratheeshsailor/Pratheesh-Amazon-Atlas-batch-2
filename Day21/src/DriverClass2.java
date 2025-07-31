interface ICalcShapesArea {
    void calcArea();
    void calcVolume();  // Problem: Not all shapes have volume
}

class Circle2 implements ICalcShapesArea {
    @Override
    public void calcArea() {
        System.out.println("Calculating area of Circle2...");
    }

    @Override
    public void calcVolume() {
        // ISP Violation: Circle2 has no volume, but must implement this
        System.out.println("Circle2 has no volume! (dummy method)");
    }
}

class Sphere2 implements ICalcShapesArea {
    @Override
    public void calcArea() {
        System.out.println("Calculating surface area of Sphere2...");
    }

    @Override
    public void calcVolume() {
        System.out.println("Calculating volume of Sphere2...");
    }
}

public class DriverClass2 {
    public static void main(String[] args) {
        ICalcShapesArea Circle2 = new Circle2();
        Circle2.calcArea();
        Circle2.calcVolume();  // Unnecessary and misleading

        ICalcShapesArea Sphere2 = new Sphere2();
        Sphere2.calcArea();
        Sphere2.calcVolume();
    }
}
