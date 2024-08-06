import java.util.*;
import java.util.stream.Collectors;


public class Main {
    private static int N;
    private static int P;
    private static ArrayList<Integer>[] arr;
    private static ArrayList<Integer> result;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=Integer.parseInt(sc.nextLine());
        P=Integer.parseInt(sc.nextLine());
        arr = new ArrayList[N+1];
        result=new ArrayList<>();

        for(int i=1; i<=N; i++){
            arr[i]=new ArrayList<>();
        }

        for(int i=1; i<=P; i++){
            StringTokenizer st=new StringTokenizer(sc.nextLine());
            int num1=Integer.parseInt(st.nextToken());
            int num2=Integer.parseInt(st.nextToken());
            arr[num1].add(num2);
            arr[num2].add(num1); //무방향 그래프이므로 index num1,num2 양쪽에 add
        }

        for(int i=0; i<arr[1].size();i++){
            result.add(arr[1].get(i));
        }

        int check_index=0;
        while(true){
            if(check_index== result.size()){break;}
            ArrayList<Integer> newElements = new ArrayList<>();
            for (int i = 0; i < result.size(); i++) {
                newElements.addAll(arr[result.get(i)]);
            }
            result.addAll(newElements);
            result=(ArrayList<Integer>) result.parallelStream()
                    .distinct().collect(Collectors.toList());
            check_index++;
        }

        result.remove(Integer.valueOf(1));

        System.out.print(result.size());

    }
}