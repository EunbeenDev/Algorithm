import java.util.*;
class Solution {
    int max;
    int cnt=2; // 구간 길이
    
    public int solution(int n) {
        int answer = 1; // 기본 1개 가짐(n 자기 자신)
        max = (int)n/2 +1; // 상한

        while(max-cnt+1>=1){
            int s = segSum(); 
            if(s == n){
                answer++; max--; cnt++;
            }
            else if(s < n){ cnt++; }
            else{ max--; }
        }
        
        return answer;
    }
    private int segSum(){
        return cnt*((max-cnt+1)*2+(cnt-1))/2; // 등차수열의 합
    }
}