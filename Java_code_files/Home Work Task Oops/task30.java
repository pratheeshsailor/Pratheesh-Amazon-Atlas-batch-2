import java.util.Arrays;

public class task30 {
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3};
        int[] ar2 = {4, 5, 6};

        int[][] arr = {ar1, ar2};

        // 🔸 Shallow copy (outer array copied, inner arrays shared)
        int[][] shallowCopy = Arrays.copyOf(arr, arr.length);

        // 🔹 Deep copy (both outer and inner arrays copied)
        int[][] deepCopy = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            deepCopy[i] = Arrays.copyOf(arr[i], arr[i].length);
        }

        // 🔄 Modify original inner array
        ar1[0] = 99;

        // 🖨️ Results
        System.out.println("Original array:     " + Arrays.toString(arr[0]));
        System.out.println("Shallow copy:       " + Arrays.toString(shallowCopy[0]));
        System.out.println("Deep copy:          " + Arrays.toString(deepCopy[0]));

        System.out.println("\nReference check:");
        System.out.println("arr[0] == shallowCopy[0]: " + (arr[0] == shallowCopy[0])); // true
        System.out.println("arr[0] == deepCopy[0]:    " + (arr[0] == deepCopy[0]));    // false
    }
}
