
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N= Integer.parseInt(br.readLine());
        ArrayList arr=new ArrayList<>();
        for(int i=0; i<N; i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr);
        for(Object o:arr){ sb.append(o).append('\n'); }
        System.out.println(sb);
    }
}