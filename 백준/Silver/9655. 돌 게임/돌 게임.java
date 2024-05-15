import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] dp=new int[1001];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=1;
        for(int i=4;i<=N;i++){
            dp[i]=Math.min(dp[i-3],dp[i-1])+1;
            //System.out.println(dp[i]);
        }
        if(dp[N]%2==0){ System.out.println("CY"); }
        else{System.out.println("SK");}
    }
}