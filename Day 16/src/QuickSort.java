public class QuickSort {

    // Main function to call quickSort
    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // QuickSort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // Find pivot position
            quickSort(arr, low, pi - 1);  // Recursively sort left part
            quickSort(arr, pi + 1, high); // Recursively sort right part
        }
    }

    // Partition function to rearrange the array
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and pivot (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partitioning index
    }
}
