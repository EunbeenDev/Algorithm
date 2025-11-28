import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        ArrayList<String> board = new ArrayList<>();
        for(String name:players){board.add(name);}
        
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<players.length; i++){
            map.put(players[i], i);
        }
        
        
        for(String name : callings){
            int idx = map.get(name); // board에서의 위치
            String front  = board.get(idx-1);
            Collections.swap(board, idx, idx-1);   
            map.put(name, idx-1);
            map.put(front, idx);
        }
        
        String[] answer = new String[board.size()];
        for(int i=0; i<board.size(); i++){
            answer[i]=board.get(i);
        }
        return answer;
    }
    
}