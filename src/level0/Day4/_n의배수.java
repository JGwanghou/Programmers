package level0.Day4;

public class _n의배수 {

    public static int solution(int num, int n) {
        return num %n == 0 ? 1 : 0;
    }
    public static void main(String[] args) {
        System.out.println(solution(34 ,3));
    }
}
