import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr=new ArrayList();
        arr.add(0);

        int index=1;
        int sum=0;

        while(index<=M){
            for(int i=0; i<index; i++){arr.add(index);}
            index++;
        }
        for(int i=N; i<=M; i++){ sum+=arr.get(i); }
        System.out.println(sum);
    }
}