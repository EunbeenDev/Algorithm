
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int tot=0;
        boolean[][] ar=new boolean[101][101];
        for(int i=0; i<n; i++){
            int x=sc.nextInt();
            int y=sc.nextInt();

            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    if (!ar[j][k]) {
                        ar[j][k] = true;
                        tot++;
                    }
                }
            }
        }
        System.out.print(tot);
    }
}
