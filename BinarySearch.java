public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 12, 32, 35, 46, 67, 98, 105 };
        int target = 46;
        System.out.println(BSRecursive(arr, target));
    }

    public static int BS(int[] arr, int target) {
        int n = arr.length;

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static int BSRecursive(int[] arr, int target) {
        int n = arr.length;
        return BSRecursiveHelper(arr, 0, n - 1, target);
    }

    public static int BSRecursiveHelper(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        } 

        int mid = start + (end - start) / 2;

        if(arr[mid] == target) {
            return mid;
        }
        else if (arr[mid] > target) {
            return BSRecursiveHelper(arr, start, mid - 1, target);
        } else {
            return BSRecursiveHelper(arr, mid + 1, end, target);
        }
    }
}
