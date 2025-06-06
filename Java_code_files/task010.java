import java.util.Scanner;

public class task010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers from the user
        System.out.print("Enter first number (num1): ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number (num2): ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number (num3): ");
        int num3 = sc.nextInt();

        // Logic to find the greatest number
        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is greatest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 is greatest");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("num3 is greatest");
        } else {
            System.out.println("There is a tie between two or more numbers");
        }

        sc.close();
    }
}
