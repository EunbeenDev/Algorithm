import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0; i<N; i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                case "push": //값 추가
                    dq.addLast(Integer.valueOf(st.nextToken())); break;
                case "pop": //맨 앞 값 삭제 및 출력
                    if(!dq.isEmpty()){
                        System.out.println(dq.peekFirst());
                        dq.removeFirst();}
                    else {System.out.println(-1);} break;
                case "size": //크기 조회
                    System.out.println(dq.size()); break;
                case "empty": //비어있는가?
                    if(!dq.isEmpty()){System.out.println(0);}
                    else{System.out.println(1);} break;
                case "front": //맨 앞 조회
                    if(!dq.isEmpty()){System.out.println(dq.peekFirst());}
                    else {System.out.println(-1);} break;
                case "back": //맨 뒤 조회
                    if(!dq.isEmpty()){System.out.println(dq.peekLast());}
                    else {System.out.println(-1);} break;
            }
        }
    }
}