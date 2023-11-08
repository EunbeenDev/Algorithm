package week3;
//Bronze_분해합
import java.util.*;
public class BOJ_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;
        int n_length = String.valueOf(n).length();

        for (int i = Math.max(1, n - (n_length * 9)); i < n; i++) {
            int number = i;
            int sum = 0;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum + i == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
