package Day6;

public class _01 {
    public static String solution(String my_string) {
        String reverse = "";

        for (int i = my_string.length()-1; i >= 0; i--) {
            reverse += my_string.charAt(i);
        }

        /*
        StringBuffer sb = new StringBuffer(my_string);
        String val = sb.reverse().toString();
        */

        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(solution("joiner"));
    }
}
