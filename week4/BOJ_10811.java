package week4;
//Bronze_바구니 뒤집기
import java.util.*;
public class BOJ_10811 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringTokenizer st=new StringTokenizer(sc.nextLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        int[] buckets=new int[N];
        for(int i=0; i<N;i++){buckets[i]=i+1;}

        for(int i=0; i<M;i++){
            StringTokenizer st2=new StringTokenizer(sc.nextLine());
            int start= Integer.parseInt(st2.nextToken())-1; //start_index
            int last= Integer.parseInt(st2.nextToken())-1; //last_index

            for(int j=start; j<=last; j++){
                int num1=buckets[j];
                int num2=buckets[last];
                buckets[j]=num2; buckets[last]=num1;
                last--;
            }
        }
        for(int k=0; k<N; k++){System.out.print(buckets[k]+" ");}
    }
}
