package week3;
//Silver_배
import java.util.*;
public class BOJ_2853 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[5000];
        int a = 0, temp, boat = 0;

        for (int i = 0; i < N; i++) {arr[i] = sc.nextInt();}

        for (int i = 1; i < N; i++) {
            if (arr[i] == 0){continue;}
            a = arr[i] - arr[0];
            temp = 1;
            for (int j = 1; j < N; j++) {
                if (arr[j] == 0){continue;}

                if (arr[j] % a == 1) {
                    temp += a;
                    arr[j] = 0;
                }
            }
            if (temp != 1){boat++;}
        }
        System.out.println(boat);
    }
}
