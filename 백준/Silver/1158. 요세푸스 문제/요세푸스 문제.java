import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        String line = br.readLine();
        int n = Integer.parseInt(line.split(" ")[0]);
        int k = Integer.parseInt(line.split(" ")[1]);
        for(int i=1; i<=n; i++){
            dq.addLast(i);
        }
        
        while(dq.size() > 0){
            if(sb.length() > 1){sb.append(", ");}
            for(int i=0;i<k-1;i++){dq.addLast(dq.getFirst()); dq.removeFirst();}
            sb.append(dq.getFirst()); dq.removeFirst();
        }
        sb.append(">");
        System.out.println(sb.toString());
    }
    
}