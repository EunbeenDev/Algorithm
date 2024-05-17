
import java.util.*;
import java.io.*;

public class Main {

    static int N;
    static int M;
    static int K;
    static int map[][];
    //상하좌우
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static boolean[][] visit;
    static int cnt;
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int t=0; t<T; t++){
            cnt = 0;
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            map = new int[N][M];
            visit = new boolean[N][M];

            for(int i=0; i<K; i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            } //배추 위치 입력

            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(map[i][j]==1 && !visit[i][j]){
                        DFS(i,j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }

    }
    public static void DFS(int x, int y){
        visit[x][y] = true;

        for(int i=0; i<4; i++){
            int next_x = x + dx[i];
            int next_y = y + dy[i];
            if (next_x >= 0 && next_y >= 0 && next_x < N && next_y < M) {
                if (map[next_x][next_y] == 1 && !visit[next_x][next_y]) {
                    DFS(next_x, next_y);
                }
            }
        }
    }
}