import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String[] line = br.readLine().split(" ");
            switch(line[0]){
                case("push"):
                    dq.addLast(Integer.parseInt(line[1]));
                    break;

                case("pop"):
                    if(dq.isEmpty()){sb.append("-1\n");}
                    else{sb.append(dq.getLast()+"\n");dq.removeLast();}
                    break;

                case("size"):
                    sb.append(dq.size()+"\n");
                    break;

                case("empty"):
                    if(dq.isEmpty()){sb.append("1\n");}
                    else{sb.append("0\n");}
                    break;

                case("top"):
                    if(dq.isEmpty()){sb.append("-1\n");}
                    else{sb.append(dq.getLast()+"\n");}
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}