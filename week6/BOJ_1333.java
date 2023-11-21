package week6;
// Bronze_부재중 전화 *
import java.util.*;
public class BOJ_1333 {
    private static int N;
    private static int L;
    private static int D;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        L= sc.nextInt();
        D=sc.nextInt();

        ArrayList<Boolean> arr=new ArrayList<>();

        for(int i=0; i<N; i++){
            for(int j=0; j<L; j++){
                arr.add(true);
            }
            if(i!=N-1){
                for(int j=0; j<5; j++){arr.add(false);}
            }
        }

        int result=0;
        while(result< arr.size()){
            if(arr.get(result)==false){break;}
            result+=D;
        }
        System.out.print(result);
    }
}
