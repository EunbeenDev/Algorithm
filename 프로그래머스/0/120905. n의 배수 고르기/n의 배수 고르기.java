import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> ans = new ArrayList<>();
        for(int i : numlist){
            if(i%n==0){ans.add(i);}
        }
        
        int[] answer = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
}