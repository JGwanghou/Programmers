package Day3;

import java.util.Arrays;

/*
    중앙값 구하기
 */
public class _02 {
    public int solution(int[] array) {
        int answer = 0;

        Arrays.sort(array);

        answer = array[array.length/2];

        return answer;
    }
}
