import java.util.*;

class Solution {
    boolean solution(String s) {
        
        boolean answer = true; // 초기화
        
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='('){stack.push(c);}
            else if(c==')'){
                if(stack.isEmpty()){return false;}
                else{stack.pop();}
            }
        }
        
        answer = stack.isEmpty();

        return answer;
    }
}