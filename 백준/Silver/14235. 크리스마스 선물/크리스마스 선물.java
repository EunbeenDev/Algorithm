import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N= Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if(num==0){ // 아이들을 만난 경우
                if(pq.isEmpty()){ System.out.println(-1); }
                else{ System.out.println(pq.poll()); }
            }
            else{for(int j=0; j<num; j++){pq.add(Integer.parseInt(st.nextToken()));}}
        }
    }
}
