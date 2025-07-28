class Square {
    int height;

    Square(int height) {
        this.height = height;
    }

    public int area() {
        return height * height;
    }
}

class Circle {
    int r;

    Circle(int r) {
        this.r = r;
    }

    public int area() {
        return (int)(Math.PI * r * r);  // casting to int for simplicity
    }
}

public class OpenOpenExample {

    // Not scalable — violates OCP
    public int compareArea(Square a, Square b) {
        return a.area() - b.area();
    }

    public int compareArea(Circle x, Circle y) {
        return x.area() - y.area();
    }

    public static void main(String[] args) {
        Square s1 = new Square(4);
        Square s2 = new Square(6);

        Circle c1 = new Circle(3);
        Circle c2 = new Circle(5);

        OpenOpenExample example = new OpenOpenExample();

        System.out.println("Square area difference: " + example.compareArea(s1, s2));
        System.out.println("Circle area difference: " + example.compareArea(c1, c2));
    }
}
