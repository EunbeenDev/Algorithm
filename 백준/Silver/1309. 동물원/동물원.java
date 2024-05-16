import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] dp=new int[100001];
        dp[0]=1;
        dp[1]=3;
        dp[2]=7;
        dp[3]=17;
        for(int i=4; i<=N; i++){
            dp[i]=dp[i-1]*2+dp[i-2];
            if(dp[i]>=9901){dp[i]=dp[i]%9901;}
        }
        System.out.println(dp[N]);
    }
}