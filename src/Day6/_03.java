package Day6;

import java.util.Arrays;

public class _03 {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i = 0; i < num_list.length; i++) {

            // answer[num_list[i] % 2]++;  한 줄로 정리..

            if(num_list[i] %2 == 0){
                answer[0]++;
            }else if (num_list[i] %2 == 1){
                answer[1]++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};
        solution(arr);


    }
}
