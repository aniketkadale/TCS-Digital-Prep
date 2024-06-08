public class reverseString {
    public static void main(String[] args) {
        String str = "ANIKET";
        System.out.println(reverse4(str));
    }

    public static String reverse0(String str) { // T.C -> O(N) S.C O(N)
        int n = str.length();
        StringBuilder sb = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static String reverse1(String str) { // T.C -> O(N) S.C O(N)
        int n = str.length();
        char ch[] = str.toCharArray();

        int i = 0;
        int j = n - 1;

        while (i <= j) {
            swap(ch, i, j);
            i++;
            j--;
        }

        return new String(ch);
    }

    public static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    public static String reverse2(String str) { // T.C -> O(N^2) S.C O(N^2)
        int n = str.length();

        if (str == null || n <= 1)
            return str;
        return reverse2(str.substring(1)) + str.charAt(0);

    }

    public static String reverse3(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }



    // using recustion 2nd way
    public static String reverse4(String str) {
        int n = str.length();
        char[] s = str.toCharArray();
        helper(s, 0, n - 1);
        return new String(s);
    }

    public static void helper(char[] s, int i, int j) {
        if (i > j) {
            return;
        }

        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        helper(s, i + 1, j - 1);
    }
}