import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int a=0; a<t; a++){
            Set<Integer> set = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++)
                set.add(Integer.parseInt(st.nextToken()));

            int m = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<m; i++)
                sb.append(set.contains(Integer.parseInt(st.nextToken()))? 1 : 0).append("\n");

            System.out.print(sb);
        }
    }
}
