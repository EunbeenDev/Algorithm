package week1;
//Bronze_유레카 이론
import java.util.*;
public class BOJ_10448 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // 삼각수 미리 계산 / 배열에 저장
        int[] trNum = new int[45];
        for (int i = 1; i <= 44; i++) {
            trNum[i - 1] = i * (i + 1) / 2;
        }

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            boolean tf = false;


            for (int a = 0; a < 44; a++) {
                for (int b = 0; b < 44; b++) {
                    for (int c = 0; c < 44; c++) {
                        int sum = trNum[a] + trNum[b] + trNum[c];
                        if (sum == n) {
                            tf = true;
                            break;
                        }
                    }
                    if (tf) break;
                }
                if (tf) break;
            }

            System.out.println(tf ? "1" : "0");
        }

    }

}
