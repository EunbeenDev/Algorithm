import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> deque = new LinkedList<Integer>();
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());	// 뽑아내려고 하는 수의 개수

        // 1부터 N까지 덱에 넣어둠
        for(int i = 1; i <= N; i++) {
            deque.offer(i);
        }
        int[] seq = new int[M];	

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; i++) {
            // 덱에서 뽑고자 하는 숫자의 위치(index) 찾기
            int target_idx = deque.indexOf(seq[i]);
            int half_idx;
            if(deque.size() % 2 == 0) {
                half_idx = deque.size() / 2 - 1;
            }
            else {
                half_idx = deque.size() / 2;
            }

            // 중간 지점 또는 중간 지점보다 원소의 위치가 앞에 있을 경우
            if(target_idx <= half_idx) {
                // 연산 2. idx 보다 앞에 있는 원소들을 모두 뒤로 보냄
                for(int j = 0; j < target_idx; j++) {
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }
            }
            else {	// 중간 지점보다 원소의 위치가 뒤에 있는 경우
                // 연산 3. idx를 포함한 뒤에 있는 원소들을 모두 앞으로 보냄
                for(int j = 0; j < deque.size() - target_idx; j++) {
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }
            }
            deque.pollFirst();	// 연산이 끝나면 맨 앞 원소를 삭제
        }
        System.out.println(count);
    }
}