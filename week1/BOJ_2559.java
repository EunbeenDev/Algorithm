package week1;
// Silver_수열
import java.util.*;
public class BOJ_2559 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];
        int sum = 0;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if (i < k) {
                sum += nums[i];
            }
        }

        maxSum = sum;

        for (int j = k; j < n; j++) {
            sum += nums[j]-nums[j-k];
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}
