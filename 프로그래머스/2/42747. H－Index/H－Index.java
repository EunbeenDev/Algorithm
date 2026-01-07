import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations); 
        int l = citations.length;
        
        for(int i=0; i<l; i++){
            // l-i == 오른쪽에 남은 논문 수
            int h = l-i;
            if(citations[i] >= h){
                return h;
            }
        }
        
        return answer;
    }
}