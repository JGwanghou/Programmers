package Day6;

public class _04 {

    public static String solution(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");
        for (int i = 0; i < my_string.length(); i++) {
            answer += arr[i].repeat(n);
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("hello",3));
    }
}
