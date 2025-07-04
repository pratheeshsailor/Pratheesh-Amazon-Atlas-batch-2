public class hometask04 {
    // Recursive function to search for target in array
    public static int recursiveSearch(int[] arr, int target, int index) {
        // Base case: if index goes out of bounds
        if (index >= arr.length) {
            return -1; // not found
        }

        // If current element matches the target
        if (arr[index] == target) {
            return index;
        }

        // Recursive call: search in the rest of the array
        return recursiveSearch(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {4, 7, 2, 9, 1, 5};
        int target = 9;

        int result = recursiveSearch(array, target, 0);

        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
