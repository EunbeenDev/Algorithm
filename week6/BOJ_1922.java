package week6;
// Gold_네트워크 연결
import java.util.*;

class Edge implements Comparable<Edge>{
    int start;
    int end;
    int weight;

    Edge(int start, int end, int weight){
        this.start=start;
        this.end=end;
        this.weight=weight;
    }
    @Override
    public int compareTo(Edge o){ //Edge 객체를 가중치(weight)를 기준으로 비교
        return weight-o.weight;
        //음수-> 현재 가중치가 더 작다는 뜻
    }
}
public class BOJ_1922 {
    static int[] parent;
    static ArrayList<Edge> edgeList;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringTokenizer st;

        int N=Integer.parseInt(sc.nextLine());
        int M=Integer.parseInt(sc.nextLine());

        edgeList=new ArrayList<>();
        for(int i=0; i<M; i++){
            st=new StringTokenizer(sc.nextLine());
            int start=Integer.parseInt(st.nextToken());
            int end=Integer.parseInt(st.nextToken());
            int weight=Integer.parseInt(st.nextToken());
            edgeList.add(new Edge(start,end,weight));
        }
        parent=new int[N+1];
        for(int i=0; i<N; i++){
            parent[i]=i;
        }

        Collections.sort(edgeList);

        int result=0;

        // 간선 리스트(edgeList)를 가중치를 기준으로 오름차순으로 정렬 후,
        // 사이클을 형성하지 않는 최소 가중치 간선을 선택하여 MST를 구성
        for(int i=0; i< edgeList.size(); i++){
            Edge edge=edgeList.get(i);
            if(find(edge.start)!=find(edge.end)){
                result+= edge.weight;
                union(edge.start, edge.end);
            }
        }
        System.out.print(result);
    }

    // 주어진 정점의 대표(루트)를 찾아 return
    // 동시에 경로 압축(Path Compression)을 수행
    // parent 배열을 사용하여 각 정점의 부모를 나타냄
    // 재귀적으로 부모를 찾아가면서 동시에 해당 정점의 부모를 최상위 루트로 갱신
    public static int find(int x){
        if(x==parent[x]){return x;}
        return parent[x]=find(parent[x]);
    }

    // 각 정점의 대표를 찾아서 두 정점의 대표가 다르면 하나의 집합으로 union
    public static void union(int x, int y){
        x=find(x);
        y=find(y);
        if(x!=y){parent[y]=x;}
    }
}
