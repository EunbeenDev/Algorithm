import java.util.*;
class Solution {
    public int[] solution(int n) {
        Set<Integer> ans = new TreeSet<>();
        
        for(int i=1; i <= n/2 + 1; i++){
            if(n%i==0){
                ans.add(i); ans.add(n/i);
            }
        }
        
        int[] answer = new int[ans.size()];
        int idx = 0;
        for(int i : ans){
            answer[idx] = i; 
            idx++;
        }
        return answer;
    }
}