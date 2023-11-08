package mju_Algorithm;
import java.io.*;
import java.util.*;
public class BOJ_1363 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // n 입력
        int k = Integer.parseInt(br.readLine()); // k 입력
        int[] keys = new int[k]; // key 배열 선언

        for (int i = 0; i < k; i++) {
            keys[i] = Integer.parseInt(br.readLine()); // key 값 입력
        }

        Arrays.sort(keys); // key 배열 정렬

        // dp[i][j]: i부터 j까지의 구간에 대한 최소 효율성
        int[][] dp = new int[k][k];

        // 구간 길이가 1인 경우 초기화
        for (int i = 0; i < k; i++) {
            dp[i][i] = keys[i];
        }

        // 구간 길이를 2부터 k까지 증가시키면서 최소 효율성 계산
        for (int len = 2; len <= k; len++) {
            for (int i = 0; i <= k - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;

                // i부터 j까지의 구간을 루트로 하는 트리를 고려
                for (int root = i; root <= j; root++) {
                    int left = (root > i) ? dp[i][root - 1] : 0;
                    int right = (root < j) ? dp[root + 1][j] : 0;
                    int cost = left + right + sum(keys, i, j);
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }

        System.out.println(dp[0][k - 1]); // 최종 결과 출력
    }

    // 배열 keys에서 인덱스 start부터 end까지의 합을 계산하는 함수
    private static int sum(int[] keys, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += keys[i];
        }
        return sum;
    }
}
