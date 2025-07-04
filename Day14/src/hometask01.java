public class hometask01 {

    // Recursive method to find factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: 0! = 1 and 1! = 1
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        int num = 5; // Change this to any number you want
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
