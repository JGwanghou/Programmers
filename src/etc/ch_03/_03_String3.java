package etc.ch_03;

public class _03_String3 {
    public static void main(String[] args) {

        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // false;
        System.out.println(s1.equals("Java")); // true

        // 대소문자 구분 없이 오로지 문자열 일치여부 체크
        System.out.println(s2.equalsIgnoreCase("python")); // true

        // 문자열 비교 심화
        s1 = "1234";
        s2 = "1234";

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}
