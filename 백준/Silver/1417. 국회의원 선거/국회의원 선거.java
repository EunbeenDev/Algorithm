
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int N = Integer.parseInt(br.readLine());
        int Dasom = Integer.parseInt(br.readLine());
        int cnt = 0;
        // pq.add(Dasom);
        if(N>1){
            for(int i=1; i<N; i++){
                pq.add(Integer.parseInt(br.readLine()));
            }

            while(pq.peek() >= Dasom){
                int max = pq.poll();
                Dasom++;
                max--;
                pq.add(max);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
