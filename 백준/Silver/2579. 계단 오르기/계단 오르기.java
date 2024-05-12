import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] step = new int[N];
        int[] dp = new int[N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            step[i] = Integer.parseInt(st.nextToken());
        }

        // 계단이 1개일 경우
        if(N == 1) {
            System.out.println(step[0]);
            return;
        }

        // 계단이 2개일 경우
        if(N == 2) {
            System.out.println(step[0] + step[1]);
            return;
        }

        dp[0] = step[0];
        dp[1] = step[0] + step[1];
        dp[2] = Math.max(step[0] + step[2], step[1] + step[2]);

        for(int i=3; i<N; i++){
            // i번째 계단을 밟았을 때의 최대 점수 = i-2번째 계단을 밟은 경우와 i-3번째 계단을 밟은 경우 중 큰 값 + 현재 계단의 점수
            // 이때, i-1번째 계단을 밟았을 경우는 고려X (연속된 세 개의 계단을 밟는 경우에 대한 조건)
            dp[i] = Math.max(dp[i-2] + step[i], dp[i-3] + step[i-1] + step[i]);
        }
        System.out.println(dp[N-1]);
    }
}
