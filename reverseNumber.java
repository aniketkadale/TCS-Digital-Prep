public class reverseNumber {
    public static void main(String[] args) {
        int n = 456;
        System.out.println(reverse0(n));
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

    public static int reverse1(int n) { // T.C -> O(d) S.C -> O(d) d is the no of digits in number
        StringBuilder rev = new StringBuilder();

        while(n > 0) {
            int rem = n % 10;
            rev.append(rem); 
            n /= 10;
        }

        return Integer.parseInt(rev.toString());
    }
}
