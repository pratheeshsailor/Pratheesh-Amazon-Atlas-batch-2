import java.util.Scanner; //Using while loop
public class task012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String correctLoginId = "Pratheesh";
        final String correctPwd = "112788416";
        int count = 0;

        String loginid = "";
        String pwd = "";

        while (true) {
            System.out.print("Enter your login ID: ");
            loginid = sc.nextLine();

            System.out.print("Enter your password: ");
            pwd = sc.nextLine();

            if (loginid.equals(correctLoginId) && pwd.equals(correctPwd)) {
                System.out.println("You have logged in for " + (++count) + " times");
            } else {
                System.out.println("Invalid login ID or password. Exiting...");
                break;
            }
        }

        sc.close();
    }
}
