package Day4;

import java.util.stream.IntStream;

/*
    배열 평균값 구하기
 */
public class _04 {
    public static double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return answer = (double) sum / numbers.length;
    }

    /*
        스트림 사용
        return Arrays.stream(numbers).average().orElse(0);
     */

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(solution(array));
    }
}
