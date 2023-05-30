package level0.Day3;

public class _01문자열섞기 {
    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";

        String tmp = "";
        for (int i = 0; i < str1.length(); i++) {
            tmp += String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i));
        }
        System.out.println(tmp);
//        return tmp;
    }
}
