package week1;

import java.util.Scanner;

//Bronze_알고리즘 수업 - 피보나치 수 1
public class BOJ_24416 {
    static int cnt1 = 1;
    static int cnt2 = 0;
    private static int fib(int n){
        if (n==1 || n==2){ return 1; }
        else {cnt1++; return (fib(n - 1) + fib(n - 2));}
    }

    public static int fibonacci(int n) {
        int[] f = new int[n+1];
        f[1] = f[2] = 1;

        for (int i = 3; i <= n; i++) {
            cnt2++;
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        fib(num);
        fibonacci(num);

        System.out.print(cnt1 + " " + cnt2);
    }
}
