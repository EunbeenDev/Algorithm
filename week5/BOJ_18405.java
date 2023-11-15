package week5;
//Gold_경쟁적 전염 *
import java.util.*;
import java.io.*;

public class BOJ_18405 {
    static int n,k,s,x,y;
    static int map[][];
    static boolean visited[][];
    static int dx[]= {0,0,1,-1};
    static int dy[] = {1,-1,0,0};
    static PriorityQueue<Node> pq = new PriorityQueue<>();
    // 1. 시간대가 작은 것 부터 poll
    // 2. 시간대가 같을시 작은 바이러스 숫자 poll
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] t = br.readLine().split(" ");
        n = Integer.parseInt(t[0]);
        k = Integer.parseInt(t[1]);

        map = new int[n][n];
        visited = new boolean[n][n];
        for(int i=0; i<n; i++) {
            String[] map_input = br.readLine().split(" ");
            for(int j=0; j<n; j++) {
                map[i][j] = Integer.parseInt(map_input[j]);
                if(map[i][j]!=0) {
                    visited[i][j]=true;
                    pq.add(new Node(i,j,0,map[i][j]));
                }
            }
        }

        String[] tt = br.readLine().split(" ");
        s = Integer.parseInt(tt[0]);
        x = Integer.parseInt(tt[1]);
        y = Integer.parseInt(tt[2]);

        bfs();

    }
    public static void bfs() {
        while(!pq.isEmpty()) {
            Node a= pq.poll();
            if(a.time>s) {
                // 문제 조건중 주어진 시간대가 넘어가는 경우 처리(0 출력)
                System.out.println(0);
                return;
            }
            if(a.x==x-1 && a.y==y-1 && map[a.x][a.y]!=0) {

                // map[a.x][a.y]==0 : 바이러스가 전염되지 않은 경우 -> 0이 아닐때만 출력
                System.out.println(a.virus_num);
                return;
            }
            for(int i=0; i<4; i++) {
                int nx = a.x+dx[i];
                int ny =a.y+dy[i];
                if(nx>=0 && ny>=0 && nx<n && ny<n) {
                    if(!visited[nx][ny]) {
                        visited[nx][ny] = true;
                        map[nx][ny]=a.virus_num;
                        pq.add(new Node(nx,ny,a.time+1,a.virus_num));
                    }
                }
            }
        }
    }
}
class Node implements Comparable<Node>{
    int x,y,time,virus_num;
    //time: 바이러스가 퍼질때 걸리는 시간
    //virus_num: 해당 칸에 해당하는 바이러스번호
    Node(int x, int y, int time, int virus_num){
        this.x=x;
        this.y=y;
        this.time=time;
        this.virus_num = virus_num;
    }

    public int compareTo(Node o) {
        if(this.time<o.time || this.time>o.time) {
            return this.time-o.time;
            // 시간이 같을때만 바이러스 번호를 빼야 한다.
            // this.time-o.time -> 작은 숫자가 큐에서 return
        }
        else {
            // 시간이 같을때 바이러스번호가 작은것부터 return
            return this.virus_num - o.virus_num;
        }
    }
}