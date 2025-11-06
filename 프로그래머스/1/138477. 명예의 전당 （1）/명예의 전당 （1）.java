import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // peek() 값은 최소값 유지
        int[] ans = new int[score.length];
        for(int i=0; i<score.length; i++){
            if(pq.size()==k){ // 명예의 전당이 모두 찬 경우
                // 신규 값이 명예의 전당에 들어가는 경우
                if(pq.peek() <= score[i]){pq.poll(); pq.add(score[i]);}
            }
            else{pq.add(score[i]);}
            ans[i] = pq.peek();
        }
        
        return ans;
        
    }
}