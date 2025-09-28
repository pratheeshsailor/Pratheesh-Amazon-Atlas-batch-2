package Task16;
import java.util.Scanner;
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take numbers as input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Ask user which operation
        System.out.println("Choose operation: add / sub / mul");
        String choice = scanner.next();

        Context context;

        switch (choice.toLowerCase()) {
            case "add":
                context = new Context(new OperationAdd());
                break;
            case "sub":
                context = new Context(new OperationSubtract());
                break;
            case "mul":
                context = new Context(new OperationMultiply());
                break;
            default:
                System.out.println("Invalid choice!");
                scanner.close();
                return;
        }

        int result = context.executeABC(num1, num2);
        System.out.println("Result = " + result);

        scanner.close();
    }
}
