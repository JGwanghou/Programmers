package etc.자바의정석_배열;

import java.util.Arrays;

public class _01연습 {
    public static void main(String[] args) {
        int[] iArr1 = new int [10];
        int[] iArr2 = new int [10];
        int[] iArr3 = {100, 2, 5, 9};

        // 1~10의 숫자를 순서대로 넣는다
        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;
        }

        // 랜덤 1~10의 값을 배열에 저장한다.
        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int)(Math.random()*10)+1;
        }

        // 배열에 저장된 값 출력한다.
        for (int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i]+",");
        }

        System.out.println(Arrays.toString(iArr2));
    }
}
