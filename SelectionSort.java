import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        // select the minimum element and place it on the first place by swapping
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr) { // O(N^2)
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int miniIndex = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[miniIndex]) {
                    miniIndex = j;
                }
            }

            int temp = arr[miniIndex];
            arr[miniIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
