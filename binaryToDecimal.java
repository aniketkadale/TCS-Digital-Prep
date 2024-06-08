public class binaryToDecimal {
    public static void main(String[] args) {
        String binary = "101";
        System.out.println(binToDec(binary));
    }   

    public static int binToDec(String binary) {
        int n = binary.length();
        int decimal = 0;

        for(int i = 0; i < n; i++) {
            char binaryDigit = binary.charAt(i);
            int digit = binaryDigit - '0';

            decimal += digit * Math.pow(2, n - i - 1);
        }

        return decimal;
    }
}
