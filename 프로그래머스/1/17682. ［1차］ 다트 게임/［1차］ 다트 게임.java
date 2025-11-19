import java.util.*;
class Solution {
    public Stack<Integer> st;
    public int solution(String dartResult) {
        int answer = 0;
        st = new Stack<>();
        for(int i=0; i<dartResult.length(); i++){
            
            if(i<dartResult.length()-1 && (dartResult.substring(i,i+2)).equals("10")){ // 점수가 10인지 판단
                st.push(10); i++; continue;
            }
            
            char c = dartResult.charAt(i);
            // 숫자인지 판단
            if('0'<=c && c<='9'){st.push(Integer.parseInt(String.valueOf(c))); continue;}
            else if(c=='S' || c=='D' || c=='T'){ // S,D,T
                part(c);
            }
            else{ // *,#
                award(c);
            }
        }
        
        while(!st.isEmpty()){
            System.out.println(st.peek());
            answer += st.pop();
        }
        return answer;
    }
    
    private void part(char p){
        int n = st.pop();
        switch(p){
            case('S'):
                st.push(n); break;
            case('D'):
                st.push((int) Math.pow(n,2)); break;
            case('T'):
                st.push((int) Math.pow(n,3)); break;
        }
    }
    
    private void award(char a){
        int n=st.pop();
        switch(a){
            case('*'):
                if(!st.isEmpty()){ // 스택에 이전 숫자가 존재하는 경우
                    int prev=st.pop();
                    st.push(prev*2); st.push(n*2);
                    break;
                }
                else{ // 이전 숫자가 없는 경우
                    st.push(n*2); break;
                }
            case('#'):
                st.push(0-n); break;
        }
    }
}