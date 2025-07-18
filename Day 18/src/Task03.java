import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();  // using long to handle larger inputs

        // Remove negative sign if any
        num = Math.abs(num);

        // Count digits
        int count = 0;
        if (num == 0) {
            count = 1;  // Special case: 0 has 1 digit
        } else {
            while (num > 0) {
                num /= 10;
                count++;
            }
        }

        System.out.println("It is a " + count + " digit number");
    }
}
