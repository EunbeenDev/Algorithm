import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> ans = new ArrayList<>();
        for(int i : arr){
            if(i%divisor==0){ans.add(i);}
        }
        Collections.sort(ans);
        if(ans.size()==0){ans.add(-1);}
        int[] answer = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){answer[i] = ans.get(i);}
        
        return answer;
    }
}