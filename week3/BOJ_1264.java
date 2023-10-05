package week3;
//Bronze_모음의 개수
import java.util.*;
public class BOJ_1264 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Character> gathers=new ArrayList<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));

        while(true){
            String st=sc.nextLine();
            if(st.equals("#")){break;}

            int cnt=0;
            StringBuilder sb=new StringBuilder(st);
            for(int i=0;i<st.length();i++){
                if(gathers.contains(sb.charAt(i))){cnt++;}
            }
            System.out.println(cnt);
        }
    }
}
