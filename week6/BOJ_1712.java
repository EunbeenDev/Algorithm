package week6;
// Bronze_손익분기점
import java.util.*;
public class BOJ_1712 {
    private static Long A;
    private static Long B;
    private static Long C;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A=sc.nextLong();
        B= sc.nextLong();
        C= sc.nextLong();

        if (B >= C) {
            System.out.println("-1");
        } else {
            long n = A / (C - B) + 1;
            System.out.println(n);
        }
    }
}
