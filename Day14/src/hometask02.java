public class hometask02 {

    // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) return 0;           // Base case 1
        if (n == 1) return 1;           // Base case 2
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive step
    }

    public static void main(String[] args) {
        int terms = 10; // Change this to print more or fewer terms

        System.out.println("Fibonacci series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
