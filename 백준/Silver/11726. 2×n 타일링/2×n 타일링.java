import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] dp=new int[1001];
        int N=Integer.parseInt(br.readLine());
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for(int i=4; i<=N; i++){
            dp[i]=dp[i-2]+dp[i-1];
            if(dp[i]>=10007){dp[i]=dp[i]%10007;}
        }
        System.out.println(dp[N]);
    }
}