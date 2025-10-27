import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n==1){return 1;}
        
        Set<Integer> s = new HashSet<>();
        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                s.add(i); s.add(n/i);
            }
        }
        for(int i:s){
            answer+=i;
        }
        return answer;
    }
}
