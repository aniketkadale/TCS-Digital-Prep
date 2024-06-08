import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(reverse2(arr)));
    }

    public static int[] reverse0(int[] arr) { // T.C -> O(N) S.C O(N)
        int n = arr.length;
        int[] rev = new int[n];
        int k = 0;

        for (int i = n - 1; i >= 0; i--) {
            rev[k++] = arr[i];
        }

        return rev;
    }

    public static int[] reverse1(int[] arr) { // T.C -> O(N) S.C O(1)
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            swap(arr, i++, j--);
        }

        return arr;

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] reverse2(int[] arr) {
        int n = arr.length;
        helper(arr, 0, n - 1);
        return arr;
    }

    public static void helper(int[] arr, int i, int j) {
        if(i > j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        helper(arr, i + 1, j - 1);
    }
}