import java.util.*;
class Solution {
    public String solution(String new_id) {
        // 소문자 변환
        new_id = new_id.toLowerCase();
        // 사용 불가 문자 제거
        new_id = new_id.replaceAll("[^a-z0-9._-]", "");
        Stack<Character> st = new Stack<>();
        int s = 0;
        
        if(new_id.length()>0){
            for(int i=0; i<new_id.length(); i++){
                char c = new_id.charAt(i);
                if(c=='.'){ // 입력하려는 문자가 마침표인 경우
                    if(st.isEmpty()){continue;} // 첫 값이 마침표인 경우
                    else if(!st.isEmpty() && st.peek()=='.'){continue;} // 끝 값이 마침표인 경우
                }
                st.push(c);
                if(st.size()>16){break;}
            }
        }
        
        // 빈 문자열일 경우 a add
        if(st.isEmpty()){st.push('a');}
        
        // 마지막 문자가 마침표인 경우 최종적으로 제거
        while(st.size()>=16){st.pop();}
        if(st.peek()=='.'){st.pop();}
        
        // 길이가 2 이하인 경우 마지막 문자 반복 push
        if(st.size()<=2){
            char l = st.peek();
            while(st.size()<3){st.push(l);}
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){sb.append(st.pop());}
        
        return sb.reverse().toString();
    }
}