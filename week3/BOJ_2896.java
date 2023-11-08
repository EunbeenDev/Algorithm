package week3;
//Bronze_무알콜 칵테일
import java.util.*;
public class BOJ_2896 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C;
        double I, J, K;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        I = sc.nextDouble();
        J = sc.nextDouble();
        K = sc.nextDouble();

        double a = A / I;
        double b = B / J;
        double c = C / K;

        double min = Math.min(Math.min(a, b), c);

        System.out.printf("%.6f %.6f %.6f%n", A - min * I, B - min * J, C - min * K);
    }
}
