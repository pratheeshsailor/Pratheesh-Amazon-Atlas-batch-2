import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the stack
        System.out.println("Stack: " + stack);

        // Pop the top element
        int poppedElement = stack.pop();

        // Print the popped element
        System.out.println("Popped element: " + poppedElement);

        // Display the stack after pop
        System.out.println("Stack after pop: " + stack);
    }
}
