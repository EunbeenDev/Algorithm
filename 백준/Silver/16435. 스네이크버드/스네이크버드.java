import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int snake_len=Integer.parseInt(st.nextToken());

        StringTokenizer fruits=new StringTokenizer(br.readLine());
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0; i<N; i++){ arr.add(Integer.valueOf(fruits.nextToken()));}
        Collections.sort(arr);
        while(arr.size()>0 && arr.get(0)<=snake_len){
            snake_len++; arr.remove(0);
        }

        System.out.println(snake_len);
    }
}