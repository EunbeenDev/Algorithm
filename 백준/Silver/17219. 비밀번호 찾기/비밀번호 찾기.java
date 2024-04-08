import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        HashMap<String, String> map=new HashMap<>();

        for(int i=0; i<N; i++){
            st=new StringTokenizer(br.readLine());
            String link=st.nextToken();
            String pw=st.nextToken();
            map.put(link, pw);
        }
        for(int i=0; i<M; i++){
            System.out.println(map.get(br.readLine()));
        }
        
    }
}
