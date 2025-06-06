import java.util.Scanner;  // Using do-while loop
public class task013_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String loginid;
        String pwd;
        int count = 0;

        do {
            System.out.println("You have logged in for " + (++count) + " times");

            System.out.print("Enter your login ID: ");
            loginid = sc.nextLine();

            System.out.print("Enter your password: ");
            pwd = sc.nextLine();

        } while (loginid.equals("Pratheesh") && pwd.equals("12345867"));

        System.out.println("Invalid login ID or password. Exiting...");
        sc.close();
    }

}
