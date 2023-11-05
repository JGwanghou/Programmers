package Day10;

public class _01 {
    public int solution(int[] dot) {
        int result = 0;

        int x = dot[0];
        int y = dot[1];

        // 제 1사분면
        if (x > 0 && y > 0) {
            result = 1;
        }

        // 제 2사분면
        if (x < 0 && y > 0) {
            result = 2;
        }

        // 제 3사분면
        if (x < 0 && y < 0) {
            result = 3;
        }

        // 제 4사분면
        if (x > 0 && y < 0) {
            result = 4;
        }

        return result;
    }


}
