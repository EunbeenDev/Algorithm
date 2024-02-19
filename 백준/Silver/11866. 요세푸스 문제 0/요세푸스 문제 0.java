import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();  // 큐를 LinkedList로 초기화

        for (int i = 1; i <= N; i++) { q.add(i); } //큐 생성

        System.out.print("<");

        while (!q.isEmpty()) {
            for (int i = 0; i < K - 1; i++) { // K-1번 앞에 있는 원소를 뒤로 보냄
                int val = q.poll();
                q.offer(val);
            }
            // K번째로 나오는 원소를 삭제함과 동시에 출력
            System.out.print(q.poll());
            // 큐가 비어있지 않으면 쉼표와 공백 추가
            if (!q.isEmpty()) { System.out.print(", "); }
        }
        System.out.println(">");
    }
}
