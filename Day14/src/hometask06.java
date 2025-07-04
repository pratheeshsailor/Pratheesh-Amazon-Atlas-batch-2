public class hometask06 {
    // Recursive function to reverse a string (simulating null-terminated behavior)
    public static void reverse(char[] str, int index) {
        if (str[index] == '\0') {
            return; // Base case: reached null terminator
        }
        reverse(str, index + 1); // Recurse until end
        System.out.print(str[index]); // Print during stack unwinding
    }

    public static void main(String[] args) {
        // Simulate a null-terminated string
        char[] str = {'H', 'e', 'l', 'l', 'o', '\0'};

        System.out.print("Reversed string: ");
        reverse(str, 0); // Start recursion from index 0
    }
}
