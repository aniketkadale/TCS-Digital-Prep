public class PowerXtoN {
    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        System.out.println(findPower0(x, n));
    }

    public static int findPower0(int x, int n) { // T.C -> O(N) S.C -> O(1)
        int power = 1;

        for(int i = 1; i <= n; i++) {
            power = power * x;
        }

        return power;
    }
}
