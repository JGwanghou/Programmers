package etc.ch_01;

public class _01_TypeCasting {
    public static void main(String[] args) {
        // 숫자 -> 문자열
        String s1 = String.valueOf(93); // 방법1
        s1 = Integer.toString(93); // 방법2
        // 실수
        String s2 = String.valueOf(98.7);
        s2 = Double.toString(98.7);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("89.8");
        System.out.println(d);
    }
}
