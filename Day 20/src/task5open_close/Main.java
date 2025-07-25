package task5open_close;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Square(4);
        Shape s2 = new Circle(3);

        AreaComparer comparer = new AreaComparer();
        double result = comparer.compareArea(s1, s2);

        if (result > 0)
            System.out.println("First shape has larger area");
        else if (result < 0)
            System.out.println("Second shape has larger area");
        else
            System.out.println("Both shapes have equal area");
    }
}
