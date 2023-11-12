package week5;
//Bronze_공 바꾸기 *
import java.util.*;
public class BOJ_10813 {
    private static int N;
    private static int M;
    private static int[] buckets;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringTokenizer st=new StringTokenizer(sc.nextLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        buckets=new int[N+1];
        for(int i=0; i<=N; i++){buckets[i]=i;}

        for(int i=0; i<M; i++){
            st=new StringTokenizer(sc.nextLine());
            int num1=Integer.parseInt(st.nextToken());
            int num2=Integer.parseInt(st.nextToken());
            int ball1=buckets[num1];
            int ball2=buckets[num2];
            buckets[num1]=ball2;
            buckets[num2]=ball1;
        }

        for(int i=1; i<=N; i++){System.out.print(buckets[i]+" ");}
    }
}
