class Solution {
    long div_num = 1000000007;
    public long solution(int n) {
        long[] dp = new long[n+1];
        dp[0]=0; dp[1]=1; dp[2]=2;
        for(int i=3; i<=n; i++){
            dp[i] = (dp[i-2]+dp[i-1])%div_num;
        }
        return dp[n]%div_num;
    }
}