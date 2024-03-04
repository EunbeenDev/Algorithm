import java.util.*;

public class Main {
    static long[][] dp = new long[25][300];

    private static void solve(int idx) {
        if (idx > 20) {
            return;
        }

        int i = 0;
        while (dp[idx - 1][i] != 0) {
            long nowCoe = dp[idx - 1][i];
            for (int root = 0; root <= idx; root++) {
                int nextRoot = i + root;
                dp[idx][nextRoot] += (nowCoe * 1);
            }
            i++;
        }
        solve(idx + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        dp[0][0] = 1;
        solve(1);

        for (int i = 1; i <= T; i++) {
            long k = scanner.nextLong();
            long n = scanner.nextLong();
            System.out.println(dp[(int) k][(int) n]);
        }
    }
}
