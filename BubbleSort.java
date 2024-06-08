import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        // Bubble sort picks up the max element and put it to the last by adjacent swaps
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr) { // worst: O(N^2) best: O(N)
        int n = arr.length;

        for(int i = n - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
