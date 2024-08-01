
import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        // 7/1=7, 70/30=2.~
        // 7일, 3일, 9일
        
        // 각 작업이 완료되는 일수를 계산, 큐에 추가
        for (int i = 0; i < progresses.length; i++) {
            int p = 100 - progresses[i];
            int s = speeds[i];
            int day = (p % s == 0) ? (p / s) : (p / s) + 1;
            queue.add(day);
        }
        
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int current = queue.poll();
            int count = 1;
            
            // 현재 작업과 동시에 배포 가능한 작업 수 계산
            while (!queue.isEmpty() && current >= queue.peek()) {
                count++;
                queue.poll();
            }
            result.add(count);
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
