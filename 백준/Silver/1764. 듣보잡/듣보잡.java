
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> no_listen = new HashSet<>();
        HashSet<String> no_see = new HashSet<>();
        
        for(int i=0; i<N; i++){
            no_listen.add(br.readLine());
        }
        for(int i=0; i<M; i++){
            no_see.add(br.readLine());
        }

        no_listen.retainAll(no_see);

        ArrayList<String> result = new ArrayList<>(no_listen);
        Collections.sort(result);
        
        System.out.println(result.size());
        for(String name : result){
            System.out.println(name);
        }
    }
}
