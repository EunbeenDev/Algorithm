import java.util.*;

public class Main {
    static int N; // 캠퍼스 가로
    static int M; // 캠퍼스 세로

    static char[][] campus; // 캠퍼스
    static boolean[][] visit; // 방문처리

    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1}; // 상하좌우

    static int result = 0; // 만나는 사람 수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); 
        M = sc.nextInt(); 

        campus = new char[N][M]; // 캠퍼스 
        visit = new boolean[N][M]; // 방문체크

        //도연이 위치에 대한 변수
        int r = 0;
        int c = 0;

        //입력 처리
        for(int i=0;i<N;i++) {
            String s = sc.next();
            for(int j=0;j<M;j++) {
                campus[i][j] = s.charAt(j);
                //도연이 위치를 저장
                if(campus[i][j]=='I') {
                    r = i;
                    c = j;
                }
            }
        }

        //DFS 수행
        DFS(r,c);
        
        if(result==0) {System.out.println("TT");} //만난 사람이 없는경우 TT 출력
        else {System.out.println(result);} // 만난 사람이 있으면 result 출력

    }

    public static void DFS(int x, int y) {
        visit[x][y] = true;

        if(campus[x][y]=='P') result++;

        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>=0 && ny >=0 && nx<N && ny<M && !visit[nx][ny]) {
                if(campus[nx][ny]!='X') {
                    DFS(nx,ny);
                }
            }
        }
    }
}