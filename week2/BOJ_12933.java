package week2;
//Silver_오리
import java.util.*;
public class BOJ_12933 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] counts = new int[6];
        int sz = str.length();
        int mx = 0;
        counts[0] = sz;
        for (int i = 0; i < sz; i++) {
            int n = 0;
            if (str.charAt(i) == 'q') n = 1;
            if (str.charAt(i) == 'u') n = 2;
            if (str.charAt(i) == 'a') n = 3;
            if (str.charAt(i) == 'c') n = 4;
            if (str.charAt(i) == 'k') n = 5;
            if (counts[n - 1] == 0) {
                System.out.println("-1");
                return;
            }
            counts[n]++;
            counts[n - 1]--;
            mx = Math.max(mx, counts[1] + counts[2] + counts[3] + counts[4]);
        }
        if (counts[5] * 5 != sz) {
            System.out.println("-1");
            return;
        }
        System.out.println(mx);
    }
}
