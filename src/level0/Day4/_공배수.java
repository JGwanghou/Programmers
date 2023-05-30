package level0.Day4;

/*
    정수 number와 n, m이 주어집니다.
    number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
 */
public class _공배수 {

    public static int solution(int number, int n, int m) {
        return number %n == 0 && number %m == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
