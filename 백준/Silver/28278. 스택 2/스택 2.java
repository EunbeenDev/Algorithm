import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        Stack<Integer> stack=new Stack<>();
        for(int i=0; i<N; i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int m=Integer.parseInt(st.nextToken());
            switch(m){
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if(stack.isEmpty()){System.out.println(-1);}
                    else{System.out.println(stack.pop());}
                    break;
                case 3:
                    System.out.println(stack.size());
                    break;
                case 4:
                    if(stack.isEmpty()){System.out.println(1);}
                    else{System.out.println(0);}
                    break;
                case 5:
                    if(stack.isEmpty()){System.out.println(-1);}
                    else{System.out.println(stack.peek());}
                    break;
            }
        }
    }
}
