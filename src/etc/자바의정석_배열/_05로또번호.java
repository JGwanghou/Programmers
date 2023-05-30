package etc.자바의정석_배열;

public class _05로또번호 {
    public static void main(String[] args) {
        int[] ball = new int[45];
        // 1~45 까지 채운다.
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        int tmp = 0;
        int j = 0;
        for (int i = 0; i < 6; i++) {
            j = (int)(Math.random()*45);
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;

            System.out.println("ball["+i+"]="+ball[i]);
        }
    }
}
