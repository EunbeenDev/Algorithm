import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int N = Integer.parseInt(st.nextToken()); // 도시 수
        int M = Integer.parseInt(st.nextToken()); // 도로 수
        int K = Integer.parseInt(st.nextToken()); // 거리정보
        int X = Integer.parseInt(st.nextToken()); // 출발도시

        ArrayList<Integer>[] city = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            city[i] = new ArrayList<>();
        }

        // 인덱스=출발 도시, value(arraylist)=도착 도시
        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(sc.nextLine());
            int start = Integer.parseInt(st2.nextToken());
            int end = Integer.parseInt(st2.nextToken());
            city[start].add(end);
        }

        int[] distance = new int[N + 1];
        Arrays.fill(distance, -1); // -1로 distance 초기화
        distance[X] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(X);

        while (!queue.isEmpty()) {
            int currentCity = queue.poll();

            for (int nextCity : city[currentCity]) {
                if (distance[nextCity] == -1) {
                    distance[nextCity] = distance[currentCity] + 1;
                    queue.add(nextCity);
                }
            }
        }

        boolean found = false;
        for (int i = 1; i <= N; i++) {
            if (distance[i] == K) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println(-1);
        }
    }
}
