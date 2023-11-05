package Day9;

public class _03 {
    public String solution(String rsp) {
        String answer = "";
        String[] argArray = rsp.split("");

        for (int i = 0; i < argArray.length; i++) {

            switch (argArray[i]){
                case "0":
                    answer += 5;
                    break;
                case "2":
                    answer += 0;
                    break;
                case "5":
                    answer += 2;
                    break;
            }

        }

        return answer;
    }
}
