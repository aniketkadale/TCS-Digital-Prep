public class armstrongNumber {
    public static void main(String[] args) {
        // armstrong no is a no where the sum of cubes of all digits is equal to the original no
        System.out.println(isArmStrong(153));
    }

    public static boolean isArmStrong(int n) {
        int order = order(n);
        int ams = 0;
        int nn = n;

        while(nn > 0) {
            int rem = nn % 10;
            ams += Math.pow(rem, order);
            nn /= 10;
        }

        System.out.println(ams);
        if(n == ams) {
            return true;
        }

        return false;
    }

    public static int order(int x) {
        int n = 0;
        while (x != 0) {
            n++;
            x = x / 10;
        }
        return n;
    }
}
