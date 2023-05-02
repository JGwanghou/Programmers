package etc.ch_05;

public class _02_MultiArrayLoop {
    public static void main(String[] args) {

        // 세로 크기 10 x 가로 크기 15 영화관 좌석
        String[][] seats3 = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + (j + 1);
            }
        }

        // 표 구매 D11 D12
        seats3[3][10] = "__";
        seats3[3][11] = "___";

        // 영화관 좌석번호 확인
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
