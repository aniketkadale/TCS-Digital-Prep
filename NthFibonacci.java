import java.util.*;

public class NthFibonacci {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(nthFibo2(n));
    }

    public static int nthFibo0(int n) { // T.C -> O(N) S.C O(N)
        List<Integer> list = new ArrayList<>();
        int a = 0;
        int b = 1;
        list.add(a); // 0 1 1 2 3 5 8
        list.add(b);

        for (int i = 2; i < n; i++) {
            int c = a + b;
            list.add(c);
            a = b;
            b = c;
        }

        return list.get(n);
    }

    public static int nthFibo1(int n) { // T.C -> O(2^N) S.C -> O(N)
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return nthFibo1(n - 1) + nthFibo1(n - 2);
    }



    // Memoization
    public static int nthFibo2(int n) {
        int[] memo = new int[n + 1];
        return helper(n, memo);
    }

    public static int helper(int n, int[] memo) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        if (memo[n] == 0) {
            memo[n] = helper(n - 1, memo) + helper(n - 2, memo);
        }

        return memo[n];
    }
}
