package Day3;

/*
    최빈값 구하기
 */
public class _03 {
    public int solution(int[] array) {
        int answer = 0;
        int[] number = new int[1001];
        for (int i = 0; i < array.length; i++) {
            number[array[i]]++;
        }

        int max = 0;
        int max_index = 0;
        for (int i = 0; i < number.length; i++) {
            if(number[i] > max){
                max = number[i];
                max_index = i;
            }
        }

        int count = 0;
        for(int i = 0; i < number.length; i++){
            if(number[i] == max) count++;
        }

        if(count > 1) return answer = -1;
        answer = max_index;

        return answer;

        /*

        (2)두번째 방법
        int maxCount = 0;
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }

        return answer;

        */
    }
}
