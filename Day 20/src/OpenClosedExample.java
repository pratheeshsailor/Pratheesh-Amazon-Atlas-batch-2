interface Shape {
    int area();
}

class Circle2 implements Shape {
    int r;

    Circle2(int r) {
        this.r = r;
    }

    public int area() {
        return (int)(Math.PI * r * r);  // Cast to int for simplicity
    }
}

class Square2 implements Shape {
    int height;

    Square2(int height) {
        this.height = height;
    }

    public int area() {
        return height * height;
    }
}

public class OpenClosedExample {

    public int compareArea(Shape a, Shape b) {
        return a.area() - b.area();
    }

    public static void main(String[] args) {
        Shape s1 = new Square2(5);
        Shape s2 = new Circle2(3);

        OpenClosedExample example = new OpenClosedExample();
        System.out.println("Area difference: " + example.compareArea(s1, s2));
    }
}
