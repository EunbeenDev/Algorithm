import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
            if(a==0 && b==0 && c==0) break;
            ArrayList<Integer> list=new ArrayList<>();
            list.add(a);
            list.add(b);
            list.add(c);
            Collections.sort(list);
            if(list.get(2)*list.get(2)==list.get(0)*list.get(0)+list.get(1)*list.get(1)){ System.out.println("right"); }
            else { System.out.println("wrong"); }
        }
    }
}
