import java.util.*;
class Solution {
    
    Deque<Integer> dq = new ArrayDeque<>();
    
    public int[] solution(int[] numbers) {
        
        int[] answer  = new int[numbers.length];
        // 뒤에서부터 역으로 탐색
        for(int i=numbers.length-1; i>=0; i--){
            answer[i] = findLarger(numbers[i]);
            dq.addLast(numbers[i]);
        }
        return answer;
    }

    private int findLarger(int n){
        int result = -1;
        if(dq.size()==0){return -1;}
        while(dq.size()>0){
            if(n < dq.getLast()){result = dq.getLast(); break;}
            else{dq.removeLast();}
        }
        return result;
    }
}