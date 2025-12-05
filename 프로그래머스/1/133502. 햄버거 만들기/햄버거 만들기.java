import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Deque<Integer> st = new ArrayDeque<>();
        
        for(int i : ingredient){
            st.push(i);
            // top 4개가 햄버거가 완성되는 조합인지 확인
            if(st.size()>=4){
                int d = st.pop(); int c= st.pop();
                int b = st.pop(); int a = st.pop();
                
                if(a==1 && b==2 && c==3 && d==1){answer++;}
                else{
                    st.push(a); st.push(b); st.push(c); st.push(d); 
                    
                }
            }
        }
        return answer;
    }
}