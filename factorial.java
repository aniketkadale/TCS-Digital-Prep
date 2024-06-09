public class factorial {
    public static void main(String[] args) {
        int N = 1;
        System.out.println(factorialRecursive(N));
    }

    public static int findFactorial(int N) {
        if(N == 0) return 1;
        int fact = 1;

        for(int i = 1; i <= N; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static int factorialRecursive(int N) {
        if(N == 0) {
            return 1;
        }

        return N * factorialRecursive(N - 1);
    }
}
