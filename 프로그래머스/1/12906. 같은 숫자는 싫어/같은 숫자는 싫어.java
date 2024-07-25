import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();
        
        stack.push(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(stack.peek() != arr[i]){ stack.push(arr[i]); }
            else{ continue; }
        }
        
        int n=stack.size();
        int[] answer=new int[n];
        
        for(int i=n-1; i>=0; i--){ answer[i] = stack.pop(); }
        
        return answer;
        
    }
}