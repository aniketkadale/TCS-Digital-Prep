public class cognizantGenCQue1 {
    public static void main(String[] args) {
        // int[] arr = {0, -9, -12, -16, 11, -9, -25};
        int[] arr = { 0, 6, -3, -21, -25 };
        System.out.println(findLongestDays(arr));
    }   

    public static int findLongestDays(int[] arr) {
        int n = arr.length;
        int maxDays = 0;
        int count = 1;

        for(int i = 0; i < n - 1; i++) {
            if(arr[i + 1] < arr[i]) {
                count++;

                if(count >= 3) {
                    maxDays = Math.max(maxDays, count);
                }
            } else {
                count = 1;
            }
        }

        return maxDays;
    }
}
