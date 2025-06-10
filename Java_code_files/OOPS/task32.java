class Calculations {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("Sum: " + z);
    }

    public void subtraction(int x, int y) {
        z = x - y;
        System.out.println("Difference: " + z);
    }
}

// Clock as an interface
interface Clock {
    void showTime();
}

public class task32 extends Calculations implements Clock {

    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("Product: " + z);
    }

    // Implementing Clock method
    public void showTime() {
        System.out.println("Current time: 10:30 AM");
    }

    public static void main(String[] args) {
        task32 obj = new task32();
        obj.addition(10, 5);
        obj.subtraction(10, 5); // ✅ corrected here
        obj.multiplication(10, 5);
        obj.showTime();
    }
}
