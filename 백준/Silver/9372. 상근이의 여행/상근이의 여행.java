import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        // 노드와 간선의 관계를 묻는 문제
        // 국가 수: N (즉, N개의 정점)
        // N개의 정점을 잇는 간선의 최소 개수 = N-1
        for(int i=0; i<T; i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int N=Integer.parseInt(st.nextToken());
            int M=Integer.parseInt(st.nextToken());
            for(int j=0; j<M; j++){br.readLine();}
            System.out.println(N-1);
        }
    }
}