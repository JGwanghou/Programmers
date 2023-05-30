package etc.자바의정석_배열;

public class _03총점평균구하기 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;
        int[] score = {100, 88, 100, 100, 90};

        // 총점 구한다.
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        // 평균 구한다. (float)score.length = 5.0
        average = sum / (float)score.length;

        // 총점, 평균 출력
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);
    }
}
