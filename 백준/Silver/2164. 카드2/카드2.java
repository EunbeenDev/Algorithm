import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();

        int n=sc.nextInt();
        for(int i=1; i<=n; i++){q.add(i);}
        while(q.size()>1){
            q.poll();
            int to_last=q.poll();
            q.add(to_last);
        }
        System.out.print(q.poll());
    }

}