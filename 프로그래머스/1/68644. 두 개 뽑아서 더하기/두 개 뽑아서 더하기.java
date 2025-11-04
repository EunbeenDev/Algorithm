
import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> ans = new HashSet<>();
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                ans.add(numbers[i]+numbers[j]);
            }
        }
        
        int[] answer = new int[ans.size()];
        Iterator<Integer> it = ans.iterator();
        for(int i=0; i<ans.size(); i++){
            answer[i] = it.next();
        }
        Arrays.sort(answer);
        return answer;
    }
}