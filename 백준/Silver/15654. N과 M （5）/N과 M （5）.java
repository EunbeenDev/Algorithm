import java.io.*;
import java.util.*;
public class Main {
    public static int N, M;
    public static int[] arr;
    public static int[] answerArr;
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        // 1 ≤ M ≤ N ≤ 8
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        arr = new int[N];
        answerArr = new int[M];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); //사전 순 정렬
        dfs(0); //dfs 수행
        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if (depth == M) {
            for (int val : answerArr) {
                sb.append(val).append(' ');
            } sb.append('\n'); return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                answerArr[depth] = arr[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
