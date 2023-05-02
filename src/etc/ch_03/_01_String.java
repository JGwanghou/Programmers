package etc.ch_03;

public class _01_String {
    public static void main(String[] args) {
        String s = "I Like Java and Python and C++";
        System.out.println(s);

        // 문자열 길이
        System.out.println("문자열의 길이는 : " + s.length());

        // 대소문자 변환
        System.out.println("대문자로 변환 : " + s.toUpperCase()); // 대문자로

        // 소문자 변환
        System.out.println("소문자로 변환 : " + s.toLowerCase()); // 소문자로

        // 포함 관계
        System.out.println("포함 관계 : " + s.contains("Java"));
        System.out.println("포함 관계 : " + s.contains("C#"));

        System.out.println(s.indexOf("Like")); // 위치 정보 2
        System.out.println(s.indexOf("C#")); // false -1 반환

        System.out.println(s.indexOf("and")); // 처음 일치하는 위치 정보
        System.out.println(s.lastIndexOf("and")); // 마지막으로 일치하는 위치 정보
    }
}
