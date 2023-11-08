package week2;
//Silver_하노이탑
import java.math.BigInteger;
import java.util.*;
public class BOJ_1914 {
    static ArrayList<int[]> steps;
    private static void hanoi(int n, int from, int to, int via) {
        if(n == 1) { steps.add(new int[] {from, to}); }
        else {
            hanoi(n-1, from, via, to);
            steps.add(new int[] {from, to});
            hanoi(n-1, via, to, from);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        steps=new ArrayList<>();

        BigInteger count = new BigInteger("2");
        System.out.println(count.pow(n).subtract(new BigInteger("1")));

        if(n <= 20) {
            hanoi(n, 1, 3, 2);
            for (int i = 0; i < steps.size(); i++) {
                int[] step = steps.get(i);
                System.out.println(step[0]+" "+step[1]);
            }
        }
    }
}
