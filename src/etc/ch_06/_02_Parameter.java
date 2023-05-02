package etc.ch_06;

public class _02_Parameter {
    // 전달값 있는 메소드
    public static void power(int number){
        int result = number * number;
        System.out.println(number + "의 2 승은 " + result);
        System.out.println("---------------------------");
    }

    public static void powerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + " 승은 " + result);
    }

    public static void main(String[] args) {
        // 전달값, Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9
        power(2);
        power(3);

        powerByExp(3, 5);
        powerByExp(5, 5); // 5 * 5 * 5 * 5 * 5


    }
}
