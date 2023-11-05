package Day9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
    머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
    그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
    문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
 */
public class _02 {


    public static String solution(String letter) {
        String answer = "";
        String[] expressionKey = {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };

        Map<String, Character> map = new HashMap<>();
        for (int i = 0; i < expressionKey.length; i++) {
            map.put(expressionKey[i], (char) (97 + i));
            System.out.println("저장되는 Key 값 : " + (char) (97 + i)+" ");
        }

        String[] inputSplit = letter.split(" "); // 공백으로 입력 값 나누기
        System.out.println("inputSplit 값 : " + Arrays.toString(inputSplit));

        for (String splitKey : inputSplit){
            for (String mapKey : map.keySet()){ // 공백으로 나뉘어진 입력 값과 맵에 저장된 키 값 비교 시작
                if(splitKey.equals(mapKey)){
                    answer += String.valueOf(map.get(splitKey));
                }
            }
        }
        System.out.println("answer 의 값 : " + answer);
        return answer;
    }

    public static void main(String[] args) {

    }
}
