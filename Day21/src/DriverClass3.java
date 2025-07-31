// Interface for shapes that have area and perimeter (2D shapes)
interface ICalcArea {
    void calcArea();
    void calcPerimeter();
}

// Interface for shapes that have volume (3D shapes)
interface ICalcVolume {
    void calcVolume();
}

// Circle is a 2D shape: only implements ICalcArea
class Circle implements ICalcArea {
    @Override
    public void calcArea() {
        System.out.println("Calculating area of Circle...");
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Calculating perimeter of Circle...");
    }
}

// Sphere3 is a 3D shape: implements both ICalcArea and ICalcVolume
class Sphere3 implements ICalcArea, ICalcVolume {
    @Override
    public void calcArea() {
        System.out.println("Calculating surface area of Sphere3...");
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Calculating circular cross-section perimeter...");
    }

    @Override
    public void calcVolume() {
        System.out.println("Calculating volume of Sphere3...");
    }
}

public class DriverClass3 {
    public static void main(String[] args) {
        ICalcArea circle = new Circle();
        circle.calcArea();
        circle.calcPerimeter();

        Sphere3 Sphere3 = new Sphere3();
        Sphere3.calcArea();
        Sphere3.calcPerimeter();
        Sphere3.calcVolume();
    }
}
