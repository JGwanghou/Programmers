package level0.Day3;

public class _03_문자열곱하기 {

    public static void main(String[] args) {
        String my_string = "string";
        int k = 3;

        String tmp = "";
        for (int i = 0; i < k; i++) {
            tmp += my_string;
        }
//        return tmp;
        System.out.println(tmp);
    }

}
