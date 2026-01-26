import java.util.*;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(sc.nextLine());
            if(num !=0){ dq.addFirst(num);}
            else{dq.removeFirst();}

        }
        
        for(int d : dq){
            answer+=d;
        }
        
        System.out.println(answer);
    }
}