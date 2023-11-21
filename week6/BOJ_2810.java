package week6;
// Bronze_컵홀더
import java.util.*;
public class BOJ_2810 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=Integer.parseInt(sc.nextLine());
        String input=sc.nextLine();

        int cnt=1;
        int i=0;
        while(i<input.length()){
            if(input.charAt(i)=='L' && input.charAt(i+1)=='L'){cnt++; i+=2;}
            else if(input.charAt(i)=='S'){cnt++; i++;}
            else{i++;}
        }
        if(cnt<=N){System.out.print(cnt);}
        else{System.out.print(N);}
    }
}
