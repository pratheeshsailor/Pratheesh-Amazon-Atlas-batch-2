public class task020 {
    public static void main(String[] args) {
        // Initialize char array with name
        char[] Name = {'P', 'r', 'a', 't', 'h', 'e', 'e', 's', 'h'};

        // Print the array reference (not contents)
        System.out.println(Name); // prints the letters as a string because it's char[]

        // Length of the array
        int n = Name.length;
        System.out.println("There are " + n + " letters in my name");

        // Print each letter with a for loop
        System.out.print("Letters: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Name[i] + " ");
        }
        System.out.println();

        // Shallow copy example (just copying reference)
        char[] shallowCopy = Name;
        shallowCopy[0] = 'X'; // Modify shallowCopy will affect original

        System.out.print("After shallow copy modification, Name: ");
        for (char c : Name) System.out.print(c + " ");
        System.out.println();

        // Deep copy example (new array with copied contents)
        char[] deepCopy = new char[n];
        for (int i = 0; i < n; i++) {
            deepCopy[i] = Name[i];
        }
        deepCopy[0] = 'P'; // revert first letter in deep copy

        System.out.print("Deep copy array: ");
        for (char c : deepCopy) System.out.print(c + " ");
        System.out.println();

        System.out.print("Original Name array after deep copy modification: ");
        for (char c : Name) System.out.print(c + " ");
        System.out.println();
    }
}
