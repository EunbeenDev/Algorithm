class Solution {
    public long solution(int n) {
        if(n<=2){return n;}
        // dp[i] = i번째 칸까지 가는 경우의 수
        long[] dp = new long[n+1]; 
        // 기저값 지정
        dp[0]=0; dp[1]=1; dp[2]=2;
        
        for(int i=3; i<=n; i++){
            dp[i]=(dp[i-1]+dp[i-2])%1234567;
        }
        
        return dp[n]%1234567;
    }
    
}