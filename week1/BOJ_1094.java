package week1;

import java.util.*;

//Silver_막대기
public class BOJ_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> sticks = new ArrayList<>();
        sticks.add(64);

        int sum = 64;
        int cnt = 1;

        while (sum > n) {
            int shortest = sticks.get(sticks.size() - 1);

            if (sum - shortest / 2 >= n) {
                sum -= shortest / 2;
                sticks.remove(sticks.size() - 1);
                sticks.add(shortest / 2);
            } else {
                sticks.add(shortest / 2);
                cnt+=1;
            }
        }

        System.out.print(cnt);
    }
}
