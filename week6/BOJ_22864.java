package week6;
// Bronze_피로도
import java.util.*;
public class BOJ_22864 {
    private static int A;
    private static int B;
    private static int C;
    private static int M;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        M=sc.nextInt();
        int time=0;
        int now_tired=0;
        int now_work=0;
        while(time<24){
            if(now_tired<0){now_tired=0;}
            if(now_tired+A<=M){now_tired+=A; now_work+=B;}
            else{now_tired-=C;}
            time++;
        }
        System.out.print(now_work);
    }
}
