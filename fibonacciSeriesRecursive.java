public class fibonacciSeriesRecursive {
    static int a = 0, b = 1, c = 0;
    public static void main(String[] args) {
        int n = 10;
        System.out.print(a + " " + b + " ");
        fibo(n);
    }

    public static void fibo(int n) {
        if(n > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            fibo(n - 1);
        }
    }
}
