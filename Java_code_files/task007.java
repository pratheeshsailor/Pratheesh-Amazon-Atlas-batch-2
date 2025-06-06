import java.util.Scanner;

public class task007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Id : ");
        String id = sc.nextLine();

        System.out.print("Pwd: ");
        String pwd = sc.nextLine();

        // Create a masked password using '*' characters
        String maskedPwd = "*".repeat(pwd.length());

        // Display the formatted output
        System.out.println("\nHi,\n");
        System.out.println("\tYour login id is " + id);
        System.out.println("And your pwd is " + maskedPwd);

        sc.close(); // Always good to close the scanner
    }

}
