package week4;
//Bronze_약수
import java.util.*;
public class BOJ_1037 {
    private static int N;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=Integer.parseInt(sc.nextLine());
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<N;i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);

        System.out.print(arr.get(0)*arr.get(arr.size()-1));
    }
}
