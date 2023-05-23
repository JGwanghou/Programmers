package etc.자바의정석_쓰레드;

/*
    싱글쓰레드
 */

public class _13_2싱글쓰레드 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
        }
        System.out.print("소요시간 1: " + (System.currentTimeMillis() - startTime));

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("|"));
        }
        System.out.println("소요시간 2: " + (System.currentTimeMillis() - startTime));
    }
}
