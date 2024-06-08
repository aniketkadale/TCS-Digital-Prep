public class printNToOne {
    public static void main(String[] args) {
        print0(10);
    }

    public static void print0(int n) {
        helper(1, n);
    }

    public static void helper(int i, int n) {
        if (i > n) {
            return;
        }

        helper(i + 1, n);
        System.out.print(i + " ");
    }
}
