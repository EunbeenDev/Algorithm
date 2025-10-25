class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(A);
        int s = A.length();
        
        if(A.equals(B)){return 0;}
        for(int i=0; i<s-1; i++){
            char last = sb.charAt(s-1);
            sb.deleteCharAt(s-1); // 맨 뒤 문자 삭제
            sb.insert(0,last);
            answer++;
            
            if(sb.toString().equals(B)){return answer;}
        }
        
        return -1;
    }
}