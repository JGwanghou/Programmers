package Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
    정수 n이 매개변수로 주어질 때,
    n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class _04 {
    public static int[] solution(int n) {
//      return IntStream.rangeClosed(0, n).filter(v -> v %2 == 1).toArray(); # 첫번쨰 방법 : 스트림 사용

        List<Integer> listArray = new ArrayList<Integer>();
        for (int i = 0; i <= n; i++)
            if(i %2 == 1) listArray.add(i);
//      return listArray.stream().mapToInt(i -> i).toArray(); # 두번째 방법


        int[] arr1 = new int[listArray.size()];
        for (int i = 0 ; i < listArray.size() ; i++)
            arr1[i] = listArray.get(i).intValue();
        return arr1;
    }

    public static void main(String[] args) {
        System.out.println(solution(7));
    }
}
