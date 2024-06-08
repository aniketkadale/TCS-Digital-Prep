public class primeNumber {
    public static void main(String[] args) {
        // prime no is a no >= 2 divisile 1 and itself only.
        int n = 7;
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n) { 
        if(n <= 1) return false;

        for(int i = 2; i < n; i++) { // we can also check it till the square root
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
