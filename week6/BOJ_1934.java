package week6;
// Bronze_최소공배수
import java.util.*;
public class BOJ_1934 {
    private static int N;
    private static int value;
    private static ArrayList<Integer> arr;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringTokenizer st=new StringTokenizer(sc.nextLine());
        N=Integer.parseInt(st.nextToken());
        value=Integer.parseInt(st.nextToken());
        arr=new ArrayList<>();
        int coin=0;

        for(int i=0; i<N; i++){
            int new_value=Integer.parseInt(sc.nextLine());
            if(new_value>value){break;}
            else{arr.add(new_value);}
        }

        int i=arr.size()-1;

        while(value!=0){
            int share=value/(arr.get(i)); //몫
            int remain=value%(arr.get(i)); //나머지

            value=remain;
            coin+=share;

            i--;
        }
        System.out.print(coin);
    }
}
