import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String line = br.readLine();
            if(isVPS(line)){sb.append("YES\n");}
            else{sb.append("NO\n");}
        }

        System.out.println(sb.toString());
    }
    private static boolean isVPS(String l){
        ArrayDeque<Character> dq = new ArrayDeque<>();
        for(char c : l.toCharArray()){
            switch(c){
                case('('):
                    dq.addLast(c); break;
                case(')'):
                    if(dq.size() > 0 && dq.getLast()=='('){dq.removeLast();}
                    else{dq.addLast(c);}
                    break;
            }
        }
        if(dq.size()==0){return true;}
        return false;
    }
}
