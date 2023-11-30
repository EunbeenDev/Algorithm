package week6;
// Bronze_최소공배수
import java.util.*;
public class BOJ_1934 {
    private static int N;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=Integer.parseInt(sc.nextLine());
        StringTokenizer st;
        for(int i=0; i<N; i++){
            st=new StringTokenizer(sc.nextLine());
            int num1=Integer.parseInt(st.nextToken());
            int num2=Integer.parseInt(st.nextToken());

            System.out.println((num1*num2)/GCD(num1,num2));
        }

    }

    private static int GCD(int a, int b) {
        int r=a%b;
        while(r!=0){ return GCD(b,r); }
        return b;
    }
}
