package level0.Day3;

public class _02문자리스트문자열로변환 {
    public static void main(String[] args) {

        String[] arr = {"a", "b", "c"};
        String tmp = "";
        for (int i = 0; i < arr.length; i++) {
            tmp += arr[i];
        }
//        return tmp;
        System.out.println(tmp);
    }
}
