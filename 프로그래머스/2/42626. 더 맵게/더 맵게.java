
import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        // 최소 힙 사용을 위한 우선순위 큐 사용
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long s : scoville){pq.add(s);}
        
        while(pq.peek() < K){
            if(pq.size()<2){return -1;}
            long num1 = pq.poll(); long num2 = pq.poll();
            pq.add(num1+(num2*2)); answer++;
        }
            
        return answer;
    }
}