class Solution {
    public String solution(int a, int b) {
        String[] ans = {"THU","FRI", "SAT","SUN","MON","TUE","WED"};
        
        if(a==1){ // 1월인 경우
            return ans[b%7];
        }
        int tot_days = 0;
        for(int i=1; i<=a-1; i++){ // 이전 달의 마지막 일수를 구함
            if(i<8 && i!=2){
                if(i%2==1){tot_days += 31;}
                else{tot_days += 30;}
            }
            else if(i==2){tot_days += 29;}
            else{
                if(i%2==1){tot_days+=30;}
                else{tot_days+=31;}
            }
        }
        
        
        return ans[(tot_days+b)%7];
    }
}