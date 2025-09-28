package Task16;

import java.util.Scanner;

// Strategy interface
interface ABC {
    int doOperation(int num1, int num2);
}

// Concrete Strategy 1: Addition
class OperationAdd implements ABC {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

// Concrete Strategy 2: Subtraction
class OperationSubtract implements ABC {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

// Concrete Strategy 3: Multiplication
class OperationMultiply implements ABC {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

// Context class
class Context {
    private ABC abc;

    // Constructor to set strategy
    public Context(ABC abc) {
        this.abc = abc;
    }

    // Execute the chosen strategy
    public int executeABC(int num1, int num2) {
        return abc.doOperation(num1, num2);
    }
}
