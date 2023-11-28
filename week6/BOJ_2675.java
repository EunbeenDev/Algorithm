package week6;
// Class1_Bronze_문자열 반복
import java.util.*;
public class BOJ_2675 {
    private static int N;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        StringTokenizer st=new StringTokenizer(sc.nextLine());
        N=Integer.parseInt(st.nextToken());
        for(int i=0; i<N; i++){
            st=new StringTokenizer(sc.nextLine());
            int S=Integer.parseInt(st.nextToken());
            String str= st.nextToken();

            for(int j=0; j<str.length(); j++){
                System.out.print(String.valueOf(str.charAt(j)).repeat(S));
            }
            System.out.println();
        }
    }
}
