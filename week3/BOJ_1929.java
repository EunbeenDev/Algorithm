package week3;
//Silver_소수 구하기
import java.util.*;
public class BOJ_1929 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        while(n1<=n2){
            boolean tf=false;
            for(int i=2; i<n1; i++){
                if(n1%i==0){tf=true; break;}
            }
            if(tf==false){System.out.println(n1);}
            n1++;
        }

    }
}
