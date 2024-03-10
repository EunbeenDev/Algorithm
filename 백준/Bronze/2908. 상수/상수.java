
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String i1= sc.next();
        String i2= sc.next();

        int num1=0;
        int num2=0;

        num1+=Integer.parseInt(String.valueOf(i1.charAt(2)))*100;
        num1+=Integer.parseInt(String.valueOf(i1.charAt(1)))*10;
        num1+=Integer.parseInt(String.valueOf(i1.charAt(0)));

        num2+=Integer.parseInt(String.valueOf(i2.charAt(2)))*100;
        num2+=Integer.parseInt(String.valueOf(i2.charAt(1)))*10;
        num2+=Integer.parseInt(String.valueOf(i2.charAt(0)));

        System.out.print(Math.max(num1,num2));
    }
}
