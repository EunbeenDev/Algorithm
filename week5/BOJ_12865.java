package week5;
//Gold_평범한 배낭
import java.util.*;
public class BOJ_12865 {
    private static int N;
    private static int K;
    private static int[] dp;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringTokenizer st=new StringTokenizer(sc.nextLine());
        N=Integer.parseInt(st.nextToken());
        K=Integer.parseInt(st.nextToken());
        dp=new int[K+1];

        for(int i=0; i<N; i++){
            st=new StringTokenizer(sc.nextLine());
            int W=Integer.parseInt(st.nextToken());
            int V=Integer.parseInt(st.nextToken());
            for(int j = K; j >= W; j--) {
                dp[j] = Math.max(dp[j], dp[j - W] + V);
            }
        }

        int result = 0;
        for (int i = 0; i <= K; i++) {
            result = Math.max(result, dp[i]);
        }
        System.out.print(result);
    }
}