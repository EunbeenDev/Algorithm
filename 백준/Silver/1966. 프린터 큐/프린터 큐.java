import java.io.*;
import java.util.*;

public class Main {

    static class Docs implements Comparable<Docs> {
        int index;
        int prior;

        Docs(int index, int prior) {
            this.index = index;
            this.prior = prior;
        }

        @Override
        public int compareTo(Docs d) {
            return d.prior - this.prior;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int targetIndex = Integer.parseInt(st.nextToken());

            Queue<Docs> queue = new LinkedList<>();
            PriorityQueue<Docs> pq = new PriorityQueue<>();

            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for (int j = 0; j < num; j++) {
                int p = Integer.parseInt(st2.nextToken());
                Docs doc = new Docs(j, p);
                queue.add(doc);
                pq.add(doc);
            }

            int printOrder = 0;
            while (!queue.isEmpty()) {
                Docs current = queue.poll();

                if (current.prior == pq.peek().prior) {
                    pq.poll();
                    printOrder++;
                    if (current.index == targetIndex) {
                        System.out.println(printOrder);
                        break;
                    }
                } else {
                    queue.add(current);
                }
            }
        }
    }
}
