package week6;
// Class1_Bronze_최소, 최대
import java.util.*;
public class BOJ_10818 {
    private static int N;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=Integer.parseInt(sc.nextLine());
        int min=0;
        int max=0;

        for(int i=0; i<N; i++){
            int num=sc.nextInt();
            if(i==0){min=num; max=num;}

            if(num>=max){max=num;}
            if (num<=min){min=num;}
        }
        System.out.print(min+" "+max);
    }
}
