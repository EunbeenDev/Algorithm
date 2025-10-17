import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int gap = 1000;
        
        for(int i : array){
            if(Math.abs(i-n)<gap){
                gap = Math.abs(i-n); answer = i;
            }
            else if(Math.abs(i-n)==gap){
                answer = Math.min(i,answer);
            }
        }
        return answer;
    }
}