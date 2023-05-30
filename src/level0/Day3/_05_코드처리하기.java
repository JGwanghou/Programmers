package level0.Day3;

class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if(code.charAt(i) == '1'){
                mode = 1 - mode;
            }else if(i %2 == mode) {
                answer += code.charAt(i);
            }
        }

        return answer.equals("") ? "EMPTY" : answer;
    }

}

public class _05_코드처리하기 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String a = sol.solution("abc1abc1abc");

        System.out.println(a);
    }
}
