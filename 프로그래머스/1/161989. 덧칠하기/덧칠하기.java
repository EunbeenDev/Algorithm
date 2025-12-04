import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        // 각 벽 번호마다 페인트가 칠해져 있는지를 나타내는 배열
        boolean[] isPainted = new boolean[n+1];
        Arrays.fill(isPainted, true);
        for(int i : section){
            isPainted[i] = false;
        }
        
        for(int i=1; i<=n; i++){
            if(!isPainted[i]){ // 칠해져 있지 않은 벽인 경우
                answer++;
                int start = i; 
                while(start <= n && start-i<m){ // n보다 작은 동안 m만큼 칠하기 실행
                    isPainted[start]=true;
                    start++;
                }
                
            }
        }
        return answer;
    }
}