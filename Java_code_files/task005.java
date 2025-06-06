public class task005 {
    static void add() {
    int a = 2;
    int b = 3;
    int sum = a + b;
    System.out.println("Sum of numbers is " + sum);

}
    static void subtract() {
        int a = 2;
        int b = 3;
        int Sub = a - b;
        System.out.println("Diff of  numbers is " + Sub);
    }
    static void Mul() {
        int a = 2;
        int b = 3;
        int mul = a * b;
        System.out.println("Product of  numbers is " + mul);
    }

    static void divide() {
        int a = 2;
        int b = 3;
        int div = a / b;
        System.out.println("Division of  numbers is " + div);
    }

    public static void main(String[] args) {
        // Calling the add() method three times
        add();
        subtract();
        Mul();
        divide();

    }

}
