import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int avail = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        LinkedHashSet<String> set = new LinkedHashSet<>();
        int cnt = 0;

        for(int i=0; i<N; i++){
            String code = br.readLine();
            if(set.contains(code)) set.remove(code);
            set.add(code);
        }
        for(String x : set){
            cnt++;
            System.out.println(x);
            if(cnt == avail) break;
        }
    }
}
