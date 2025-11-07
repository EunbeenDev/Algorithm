import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> hm = new HashMap<>(); // <이름, 점수>
        int[] answer = new int[photo.length];
        for(int i=0; i<name.length; i++){
            if(i<yearning.length){hm.put(name[i], yearning[i]);}
            else{hm.put(name[i], 0);}
        }
        
        int idx = 0;
        for(String[] p : photo){
            for(String n : p){
                if(!hm.containsKey(n)){continue;}
                answer[idx] += hm.get(n);
            }
            idx++;
        }
        return answer;
    }
}