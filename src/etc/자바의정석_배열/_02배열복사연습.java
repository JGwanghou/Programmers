package etc.자바의정석_배열;

public class _02배열복사연습 {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};
        System.out.println(abc);
        System.out.println(num);

        char[] result = new char[abc.length+num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        System.arraycopy(abc, 0 , num, 0, abc.length);
        System.out.println(num);

        // number 인덱스 6위치에 3개 복사
        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);
    }
}
