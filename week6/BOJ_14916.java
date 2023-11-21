package week6;
// Silver_거스름돈 *
import java.util.*;
public class BOJ_14916 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] coin=new int[100001];

        coin[0]=0;
        coin[1]=-1;
        coin[2]=1;
        coin[3]=-1;
        coin[4]=2;
        coin[5]=1;

        for (int i = 6; i <= N; i++) { coin[i] = -1; } //dp 배열 초기화

        for(int i=6; i<=N; i++){
            if(coin[i-2]==-1 || coin[i-5]==-1){coin[i]=Math.max(coin[i-2], coin[i-5])+1;}
            else{coin[i]=Math.min(coin[i-2],coin[i-5])+1;}
        }
        System.out.print(coin[N]);
    }
}
