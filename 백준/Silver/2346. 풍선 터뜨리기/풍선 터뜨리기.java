import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        Deque<int[]> list = new ArrayDeque<>();
        StringTokenizer input = new StringTokenizer(br.readLine());

        sb.append("1 ");
        int move = Integer.parseInt(input.nextToken());

        for (int i = 2; i <= num ; i++) {
            list.add(new int[]{i, Integer.parseInt(input.nextToken())});
        }

        while (!list.isEmpty()) {
            if (move > 0) {
                for (int x = 1; x < move; x++) {
                    list.add(list.pollFirst());
                }
                int[] next = list.removeFirst();
                move = next[1];
                sb.append(next[0]).append(" ");
            } else {
                for (int x = move; x < -1; x++) {
                    list.addFirst(list.pollLast());
                }
                int[] next = list.removeLast();
                move = next[1];
                sb.append(next[0]).append(" ");
            }
        }
        System.out.println(sb);
    }

}