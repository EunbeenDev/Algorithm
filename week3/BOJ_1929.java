package week3;
//Silver_소수 구하기
import java.util.*;

public class BOJ_1929 {
    public static boolean[] primes;
    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis(); // 코드 실행 전에 시간 받아오기

        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        primes=new boolean[n+1];
        eratos();

        for(int i=m; i<=n; i++){
            //false->소수
            if(!primes[i]){System.out.println(i);}
        }

        long afterTime = System.currentTimeMillis();
        long diffTime = afterTime - beforeTime;
        System.out.println("실행 시간(ms): " + diffTime);

    }

    public static void eratos(){
        primes[0]=primes[1]=true; //0,1은 소수가 아님.

        for(int i=2; i<=Math.sqrt(primes.length);i++){
            if(primes[i]){continue;}
            for(int j=i*i;j< primes.length;j+=i){primes[j]=true;}
        }
    }
}
