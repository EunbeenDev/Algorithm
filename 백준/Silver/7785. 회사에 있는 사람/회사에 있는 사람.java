import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        TreeSet<String> tm=new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<N; i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String name=st.nextToken();
            String log=st.nextToken();

            if(log.equals("leave")){if(tm.contains(name))tm.remove(name);}
            else{tm.add(name);}
        }
        for(String o: tm){ System.out.println(o); }
    }
}