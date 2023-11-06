package week4;
//Bronze_최댓값
import java.util.*;
public class BOJ_2562 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=Integer.parseInt(sc.nextLine());
        int index=1;
        int result=1;

        for(int i=0;i<8;i++){
            int next_num=Integer.parseInt(sc.nextLine());
            index++;
            if(next_num>max){result=index; max=next_num;}
        }
        System.out.println(max);
        System.out.print(result);
    }
}
