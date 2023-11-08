package week3;
//Silver_K번쨰 수
import java.util.*;
public class BOJ_11004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        StringTokenizer st=new StringTokenizer(sc.nextLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());

        List<Integer> nums=new ArrayList<>();

        st=new StringTokenizer(sc.nextLine());
        for(int i=0; i<n; i++){nums.add(Integer.parseInt(st.nextToken()));}

        Collections.sort(nums);
        System.out.print(nums.get(k-1));
    }
}