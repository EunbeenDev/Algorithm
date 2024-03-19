import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=Integer.parseInt(sc.nextLine());
        int[] fib=new int[N+1];

        fib[0]=0;
        fib[1]=1;

        for(int i=2;i<=N; i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        System.out.println(fib[N]);
    }
}
