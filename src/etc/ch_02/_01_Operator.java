package etc.ch_02;

public class _01_Operator {
    public static void main(String[] args) {

        int val;
        val = 10;

        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val); // 11

        System.out.println("===========");

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++);  // 10
        System.out.println(val); // 11

        System.out.println("===========");

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 0
        System.out.println("대기 인원 : " + waiting++); // 1
        System.out.println("대기 인원 : " + waiting++); // 2

        System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원 : 3
    }
}
