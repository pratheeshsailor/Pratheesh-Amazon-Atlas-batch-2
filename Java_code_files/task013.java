import java.util.Scanner;
public class task013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String loginid = "";
        String pwd = "";
        int count = 0;

        while (true) {
            System.out.print("Enter your login ID: ");
            loginid = sc.nextLine();

            System.out.print("Enter your password: ");
            pwd = sc.nextLine();

            if (loginid.equals("Pratheesh") && pwd.equals("12345867")) {
                System.out.println("You have logged in for " + (++count) + " times");
            } else {
                System.out.println("Invalid login ID or password. Exiting...");
                break;
            }
        }

        sc.close();
    }



}
