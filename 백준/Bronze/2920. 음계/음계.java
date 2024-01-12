
import java.util.*;

//Bronze2_음계
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        boolean b=true;
        if(first==1){
            for(int i=2; i<=8; i++){
                if(sc.nextInt()!=i){
                    b=false; System.out.print("mixed"); break;
                }
            }
            if(b){System.out.print("ascending");}
        }
        else if(first==8){
            for(int i=7; i>=1; i--){
                if(sc.nextInt()!=i){
                    b=false; System.out.print("mixed"); break;
                }
            }
            if(b){System.out.print("descending");}
        }
        else{System.out.print("mixed");}
    }
}