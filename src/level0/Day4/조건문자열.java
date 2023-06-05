package level0.Day4;

public class 조건문자열 {

    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if(ineq.equals(">") && (eq.equals("=") || eq.equals("!"))){
            if(n > m) answer = 1;
        }else if(ineq.equals("<") && (eq.equals("=") || eq.equals("!"))){
            if(n < m) answer = 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        String s = ">";


    }
}
