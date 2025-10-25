import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        // 정수끼리의 거리 = Math.abs(n-numlist[i]);
        int s = numlist.length;
        int[] answer = new int[s];
        int[][] dist = new int[s][2];
        for(int i=0; i<s; i++){
            dist[i][0] = numlist[i]; dist[i][1] = Math.abs(n-numlist[i]); // dist[값][거리]
        }
        
        // 거리(오름차순) -> 값(내림차순) 기준으로 정렬
        Arrays.sort(dist, (o1,o2)->{
            if(o1[1]==o2[1]){return o2[0]-o1[0];}
            return o1[1]-o2[1];
            
        });
        
        int idx=0;
        for(int[] d : dist){
            answer[idx] = d[0];
            idx++;
        }
        
        return answer;
    }
}