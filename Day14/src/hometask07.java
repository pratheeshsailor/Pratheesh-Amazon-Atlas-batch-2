public class hometask07 {
    // Recursive function to convert decimal to binary
    public static void decimalToBinary(int n) {
        if (n == 0) {
            return; // Base case
        }
        decimalToBinary(n / 2); // Recursive call
        System.out.print(n % 2); // Print remainder after recursion
    }

    public static void main(String[] args) {
        int number = 13;

        System.out.print("Binary of " + number + " is: ");
        if (number == 0) {
            System.out.print("0");
        } else {
            decimalToBinary(number);
        }
    }
}
