
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=Integer.parseInt(sc.nextLine());
        int Y=0;
        int M=0;
        for(int i=0; i<N; i++){
            // 나눗셈 연산시 double형으로 ceiling을 해야 올림 처리가 정상적으로 진행된다.
            double K=sc.nextInt();

            int y_count=(int)(Math.ceil(K/30));
            int m_count=(int)(Math.ceil(K/60));

            if(K%30==0){y_count++;}
            if(K%60==0){m_count++;}
            Y+=y_count*10;
            M+=m_count*15;
            
        }

        if(Y>M){System.out.print("M "+ M);}
        else if (Y==M) {System.out.print("Y M "+ Y);}
        else{System.out.print("Y "+ Y);}
    }
}
