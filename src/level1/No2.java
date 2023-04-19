package level1;

import java.util.*;

public class No2 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++){
            for(String human : photo[i]){
                if(map.containsKey(human)){
                    answer[i] += map.get(human);
                }
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        String[] nameeee = {"may", "kein", "kain", "radi"};
        int[] yearninggg = {5 , 10 , 1 , 3};
        String[][] phoooto = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
    }
}
