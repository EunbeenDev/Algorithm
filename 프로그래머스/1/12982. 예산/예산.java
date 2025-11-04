import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int b : d){
            if(budget-b<0){break;}
            budget-=b; answer++;
        }
        return answer;
    }
}