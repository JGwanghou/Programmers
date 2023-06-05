import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
    첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
    두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
    두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */


public class Main {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int denomMulti = denom1 * denom2; // 최대공약수 구하기
        System.out.println("demonMulti : " + denomMulti); // ok

        int maxYaksu1 = denomMulti / denom1;
        int maxYaksu2 = denomMulti / denom2;
        System.out.println("maxYaksu1 : " + maxYaksu1 + " maxYaksu2 : " + maxYaksu2);

        numer1 *= maxYaksu1;
        denom1 *= maxYaksu1;
        System.out.println("numer1 : " + numer1 + ", denom1 : " + denom1 );
        numer2 *= maxYaksu2;
        denom2 *= maxYaksu2;
        System.out.println("numer2 : " + numer2 + ", denom2 : " + denom2 );

        int numberResult = numer1 + numer2;
        System.out.println("numberResult : " + numberResult);

        for (int i = 1; i < denomMulti+1; i++) {
            if(denomMulti % i == 0 && numberResult % i == 0){
                answer[0] = numberResult / i;
                answer[1] = denomMulti / i;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(1,2,3,4);
    }
}