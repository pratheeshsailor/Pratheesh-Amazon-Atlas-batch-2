import java.util.Scanner;

public class task011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number (1 to 7): ");
        int day = sc.nextInt();

        // Use switch to map numbers to days
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input");
        }

        sc.close();
    }
}

