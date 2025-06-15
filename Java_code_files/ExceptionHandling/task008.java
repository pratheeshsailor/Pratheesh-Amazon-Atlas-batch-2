// User-defined exception class
class MyException extends Exception {
    public MyException(String message) {
        super(message); // Call parent class constructor with message
    }
}

public class task008 {

    // Method that throws custom exception based on condition
    static void checkAge(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Age is below 18 – Not eligible to vote.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);  // This will throw the custom exception
        } catch (MyException e) {
            System.out.println("Caught custom exception:");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}

