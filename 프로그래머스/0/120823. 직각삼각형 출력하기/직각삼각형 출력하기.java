import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "*";
        String line = "";
        
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                line += str;
            }
            System.out.println(line);   
            line = "";
        }
    }
}