package etc.자바의정석_배열;

import java.util.Arrays;

public class _06버블정렬 {
    public static void main(String[] args) {
        int[] numArr = {1, 7, 9, 8, 2, 5, 6};

        for (int i = 0; i < numArr.length-1; i++) {
            boolean changed = false;

            for (int j = 0; j < numArr.length - 1 - i; j++) {
                if(numArr[j] > numArr[j+1]){
                    int tmp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = tmp;

                    changed = true;
                }
            }
            if(!changed) break;
        }

        System.out.println(Arrays.toString(numArr));
    }
}
