package week4;
//Bronze_ROT13
import java.util.*;
public class BOJ_11655 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        String str=sc.nextLine();
        for(int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            if(!Character.isLetter(c)){
                sb.append(c); continue;
            }
            int n=(int)c +13;
            if(Character.isUpperCase(c) && n>90){n-=26;}
            if(Character.isLowerCase(c) && n>122){n-=26;}
            sb.append((char)n);
        }
        System.out.print(sb);
    }
}
