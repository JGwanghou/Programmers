package etc.ch_05;

public class _01_MultiArray {
    public static void main(String[] args) {

        // 다차원 배열

        // 소규모 영화관 좌석
        // A1 - A5
        // B1 - B5
        // C1 - C5

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(seats[i][j] + " ");
            }
        }

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // A3에 접근한다.
        System.out.println("A3 : " + seats2[0][2]);

        // A5에 접근한다
//        System.out.println("A5 : " + seats2[0][4]); error


    }
}
