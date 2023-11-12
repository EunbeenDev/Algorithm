package week5;
//Bronze_삼각 김밥
import java.util.*;
public class BOJ_2783 {
    private static int N;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringTokenizer st=new StringTokenizer(sc.nextLine());
        int seven_price=Integer.parseInt(st.nextToken());
        int seven_g=Integer.parseInt(st.nextToken());
        double result=Math.round(((double)seven_price/seven_g)*100000);

        N=Integer.parseInt(sc.nextLine());
        for(int i=0; i<N;i++){
            st=new StringTokenizer(sc.nextLine());
            int new_price=Integer.parseInt(st.nextToken());
            int new_g=Integer.parseInt(st.nextToken());
            double new_result=Math.round(((double)new_price/new_g)*100000);
            if(new_result<result){result=new_result;}
        }
        System.out.print(result/100);
    }
}
