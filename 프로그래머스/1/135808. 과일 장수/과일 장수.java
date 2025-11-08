import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int start = score.length % m;
        Arrays.sort(score);
        for(int i = 0; i<score.length/m; i++){
            int minn=10;
            for(int j=0; j<m; j++){
                minn = Math.min(minn, score[start+j]);
            }
            start+=m;
            answer+=minn*m;
        }
        return answer;
        
    }
}