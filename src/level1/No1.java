package level1;

import java.util.*;
/*
 * 플레이어수 N : 5 ~ 50,000
 * 해설진이 부른 이름 수 M : 2 ~ 1,000,000
 ----> O(N), O(M) 안에 끝내야한다.
 * 
 */
public class No1 {

    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        Map<String, Integer> map = new HashMap<>();

        // players key : mumu , value : 1
        // players key :  soe , value : 2
        // players key :  poe , value : 3
        // players key :  kai , value : 4
        // players key : mine , value : 5
        for(int i = 0 ; i<players.length; i++){
            map.put(players[i], i);
        }

        for(String call : callings){
            int player_value = map.get(call);
            
            String called = players[player_value];
            String calledFront = players[player_value - 1];

            players[player_value] = calledFront;
            players[player_value - 1] = called;

            map.put(called, player_value - 1);
            map.put(calledFront, player_value);
        }
        
        return players;
    }

    public static void main(String[] args) {

        String[] part = {"mumu", "soe", "poe", "kai", "mine"};
        String[] call = {"kai", "kai", "mine", "mine"};

        No1 no1 = new No1();
        System.out.println(no1.solution(part, call));
    }
    
}

