package Day10;

public class _04 {
    public static int[] solution(int[] numbers, String direction) {
        int tmp = 0;

        for (int i = 0; i < 2; i++) {

            if (direction.equals("left")) {
                numbers[numbers.length - 1] = numbers[0];
                tmp = numbers[numbers.length - 1];
                numbers[0] = tmp;
            }

            if (direction.equals("right")) {
                numbers[0] = numbers[numbers.length - 1];
                tmp = numbers[0];
                numbers[numbers.length - 1] = tmp;
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        int[] result = {1, 2, 3};
        String right = "right";
        String left = "left";

        System.out.println(solution(result, right));
    }
}
