public class decimalToBinary {
    public static void main(String[] args) {
        int decimal = 4;
        System.out.println(decToBin0(decimal));

    }

    public static String decToBin0(int dec) {
        if (dec == 0)
            return "0";

        StringBuilder binary = new StringBuilder();

        while (dec > 0) {
            int rem = dec % 2;
            binary.append(rem);
            dec /= 2;
        }

        return binary.reverse().toString();
    }
}
