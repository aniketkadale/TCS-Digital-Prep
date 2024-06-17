import java.util.HashMap;

public class cognizantGenCQue2 {
    public static void main(String[] args) {
        String input1 = "+868999913935";
        String input2 = "+86";
        System.err.println(findCountry(input1, input2));

    }

    public static String findCountry(String input1, String input2) {
        HashMap<String, String> map =  new HashMap<>();
        map.put("+91", "India");
        map.put("+86", "China");
        map.put("+34", "Spain");
        map.put("+1", "United States");
        map.put("+33", "France");

        if(input1.startsWith(input2)) {
            return map.getOrDefault(input2, "Unknown");
        }

        return "Unknown";
    }
}
