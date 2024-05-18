import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        long[] dp=new long[91];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        dp[3]=2;

        if(N>3){for(int i=4; i<=N; i++){dp[i]=dp[i-1]+dp[i-2];}}

        System.out.println(dp[N]);

    }
}
