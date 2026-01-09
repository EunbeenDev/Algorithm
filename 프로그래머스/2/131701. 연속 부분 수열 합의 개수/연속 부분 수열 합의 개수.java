import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> hs = new HashSet<>();
        int n = elements.length;
        
        int[] prefix = new int[n*2+1];
        prefix[0] = 0;
        prefix[1] = elements[0];
        for(int i=2; i<n*2; i++){
            if(i <= n){prefix[i] = prefix[i-1] + elements[i-1];}
            else{prefix[i] = prefix[i-1] + elements[i-n-1];}
        }
        
        // 부분 수열의 합 경우의 수 구하기
        for(int s=1; s<=n; s++){ // s = 시작점
            for(int l=1; l<=n; l++){ // l = 부분 수열의 길이
                hs.add(prefix[s+l] - prefix[s]);
            }
        }
        return hs.size()-1; // prefix[0]=0 제외
    }
}