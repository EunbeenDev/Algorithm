package week5;
// Bronze_뒤집힌 덧셈
import java.util.*;
public class BOJ_1357 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String X=sc.next();
        String Y=sc.next();

        StringBuffer sb=new StringBuffer(X);
        X=sb.reverse().toString();
        sb=new StringBuffer(Y);
        Y=sb.reverse().toString();

        int n=Integer.parseInt(X)+Integer.parseInt(Y);

        String result=String.valueOf(n);
        sb=new StringBuffer(result);
        result=sb.reverse().toString();

        System.out.print(Integer.parseInt(result));

    }
}
