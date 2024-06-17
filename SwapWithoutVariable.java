public class SwapWithoutVariable {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        swap(a, b);

    }

    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a:" + a + ", " + "b:" + b);
    }
}
