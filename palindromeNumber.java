public class palindromeNumber {
    public static void main(String[] args) {
        int n = 12321;
        System.out.println(isPalin1(n));
    }

    public static boolean isPalin0(int n) {
        int reversed = reverse0(n);

        if(n == reversed) return true;

        return false;
    }

    public static int reverse0(int n) { // T.C -> O(d) S.C -> O(1)
        int reversedNum = 0;

        while (n != 0) {
            int digit = n % 10;
            reversedNum = reversedNum * 10 + digit;
            n /= 10;
        }

        return reversedNum;
    }

    public static boolean isPalin1(int n) { // T.C -> O(N) S.C -> O(N)
        String str = String.valueOf(n);
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
