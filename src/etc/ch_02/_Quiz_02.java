package etc.ch_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 135;
        String childHeight = (height >= 120) ? " 탑승 가능합니다" : " 탑승 불가능합니다.";

        System.out.println("키가 " + height + " 이므로" + childHeight);
    }
}
