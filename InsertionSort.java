import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        // Insertion sort always picks up the element and put it at its correct position
        // by swapping with previous elements.
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr) { // worst case: O(N^2) best case: O(N)
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int j = i;

            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j - 1 , j);
                j--;
            }
        }

        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
