package week4;
//Bronze_민균이의 비밀번호
import java.util.*;
public class BOJ_9933 {
    private static int N;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=Integer.parseInt(sc.nextLine());
        ArrayList<String> arr=new ArrayList<>();
        ArrayList<String> rev_arr=new ArrayList<>();

        for(int i=0; i<N; i++){
            StringBuffer sb=new StringBuffer(sc.nextLine());
            arr.add(sb.toString());
            rev_arr.add(sb.reverse().toString());
        }

        int i=0;
        while(true){
            if(rev_arr.contains(arr.get(i))){break;}
            else{i++;}
        }
        String word=arr.get(i);
        System.out.print(word.length()+" ");
        System.out.print(word.charAt(word.length()/2));
    }
}
