class Solution {
    public int solution(String s) {
        int answer = 0;
        int l = s.length();
        char x = s.charAt(0);
        
        int x_cnt = 1; // x가 나온 횟수
        int n_cnt = 0; // x가 아닌 문자가 나온 횟수
        for(int i=1; i<l; i++){
            char c = s.charAt(i);
        
            if(c==x){x_cnt++;}
            else{n_cnt++;}
            
            if(x_cnt == n_cnt){ // 같은 경우
                System.out.println(x);
                answer++;
                if(i < l-1){
                    x=s.charAt(i+1); // x 갱신
                }
                n_cnt=0; x_cnt=0; // 초기화
            }
        }
        if (x_cnt != 0 || n_cnt != 0) answer++;

        return answer;
    }
}