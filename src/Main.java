import java.util.*;

/*
    첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
    두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
    두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */


public class Main {
    public static int[] solution(int n) {
        int[] answer = new int[(n/2) +1];

        for (int i = 0; i <= n+1; i++) {
            if(i %2 == 1){
                answer[i] = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int number = 15;


    }
}