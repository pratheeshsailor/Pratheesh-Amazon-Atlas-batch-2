public class hometask03 {

    // Recursive method to reverse a string
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str; // Base case: empty string
        }
        return reverse(str.substring(1)) + str.charAt(0); // Recursive call
    }

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverse(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }
}
