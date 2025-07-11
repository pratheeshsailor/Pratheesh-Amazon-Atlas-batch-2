public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped; // Flag to optimize: if no swaps in a pass, array is sorted

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) { // The last 'i' elements are already sorted
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array before sorting:");
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println();

        bubbleSort(data);

        System.out.println("Array after sorting:");
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}