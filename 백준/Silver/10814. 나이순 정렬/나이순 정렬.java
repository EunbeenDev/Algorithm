import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=Integer.parseInt(sc.nextLine());
        ArrayList<String>[] names=new ArrayList[201];
        for(int i=0; i<N; i++){
            StringTokenizer st=new StringTokenizer(sc.nextLine());
            int age=Integer.parseInt(st.nextToken());
            String name=st.nextToken();
            if(names[age]==null) names[age]=new ArrayList<>();
            names[age].add(name);
        }

        for(int i=0; i<201; i++){
            if(names[i]!=null){
                for(String name:names[i]){
                    System.out.println(i+" "+name);
                }
            }
        }
    }
}