import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int l = Integer.parseInt(br.readLine());
        ArrayDeque<Long> dq = new ArrayDeque<>();
        for(int i = 0; i<l; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            switch(st.nextToken()){
                case("push"):
                    dq.addLast(Long.parseLong(st.nextToken())); 
                    break;
                case("pop"):
                    if(dq.size()>0){
                        sb.append(dq.getFirst()); sb.append("\n");
                        dq.removeFirst();
                    }
                    else{sb.append(-1); sb.append("\n");}
                    break;
                case("size"):
                    sb.append(dq.size()); sb.append("\n");
                    break;
                case("empty"):
                    if(dq.isEmpty()){sb.append(1); }
                    else{sb.append(0); }
                    sb.append("\n");
                    break;
                case("front"):
                    if(dq.size()>0){
                        sb.append(dq.getFirst());
                    }
                    else{sb.append(-1);}
                    sb.append("\n");
                    break;
                case("back"):
                    if(dq.size()>0){
                        sb.append(dq.getLast());
                    }
                    else{sb.append(-1);}
                    sb.append("\n");
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}
