public class task034_1 {

    // Method with 2 parameters
    void add(int x, int y) {
        System.out.println("x = " + x + ", y = " + y);
    }

    // Method with 3 parameters (overloaded)
    void add(int x, int y, int z) {
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }

    public static void main(String[] args) {
        task034_1 obj = new task034_1();
        obj.add(10, 20, 30);
        obj.add(50, 100);
    }
}
