package Day7;

/*
    특정 문자 제거하기
 */

public class _01 {
    public static String solution(String my_string, String letter) {
        String answer = "";
        return answer = my_string.replace(letter, "");
    }

    public static void main(String[] args) {
        String a = "BCBdbe";
        String b = "B";

        System.out.println(solution(a , b));
    }
}
