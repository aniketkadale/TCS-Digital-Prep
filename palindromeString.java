public class palindromeString {
    public static void main(String[] args) {
        String str = "ABBA";
        System.out.println(isPalin1(str));
    }

    public static boolean isPalin0(String str) {
        String reversed = reverse2(str);
        System.out.println(reversed);

        if (str.equals(reversed)) {
            return true;
        }

        return false;
    }

    public static boolean isPalin1(String str) {
        int n = str.length();
        int i = 0;
        int j = n - 1;

        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static String reverse2(String str) { // T.C -> O(N^2) S.C O(N^2)
        int n = str.length();

        if (str == null || n <= 1)
            return str;

        return reverse2(str.substring(1)) + str.charAt(0);
    }
}