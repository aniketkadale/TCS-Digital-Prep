public class MaxSumSubarrayKadaneAlgo {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSumSubarray2(nums));
    }

    // T.C -> O(N^3) S.C -> O(N)
    public static int maxSumSubarray0(int[] nums) {
        int n = nums.length;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += nums[k];
                }

                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    // T.C -> O(N^2) S.C -> O(N)
    public static int maxSumSubarray1(int[] nums) {
        int n = nums.length;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    // T.C -> O(N) S.C -> O(1)
    public static int maxSumSubarray2(int[] nums) {
        int n = nums.length;
        int maxSum = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum < 0) {
                sum = 0;
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }

}