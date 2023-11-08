package week2;
//Silver_RGB거리
import java.util.*;
public class BOJ_1149 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[][] dp = new int[n+1][3];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int r = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + r;
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + g;
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + b;
        }
        System.out.println(Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2])));
    }
}
