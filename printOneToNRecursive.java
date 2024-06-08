public class printOneToNRecursive {
    public static void main(String[] args) {
       print0(10);
    }

    public static void print0(int n) {
        helper(1, n);
    }

    public static void helper(int i, int n) {
        if(i > n) {
            return;
        }

        System.out.print(i + " ");
        helper(i + 1, n);
    }
}
