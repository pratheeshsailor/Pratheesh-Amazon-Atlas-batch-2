import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Display the stack
        System.out.println("Stack: " + stack);

        // Pop the top element
        int poppedElement = stack.pop();
        int peekElement = stack.peek(40);  // returns an object from the top of the stack
        int position = stack.search(20);  //returns the position of the element from the top of the stack
        boolean result = stack.empty();  //whether a stack is empty or not

        // Print the popped element
        System.out.println("Popped element: " + poppedElement);

        // Display the stack after pop
        System.out.println("Stack after pop: " + stack);
        System.out.println("Stack after peek: " + peekElement);
        System.out.println("Stack searching : " + position);
        System.out.println("Stack searching : " + result);

    }
}
