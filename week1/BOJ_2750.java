package week1;
//Silver_수 정렬하기
import java.util.*;
public class BOJ_2750 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] nums=new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
            sc.nextLine();
        }

        Arrays.sort(nums);

        for(int j=0; j<n; j++){
            System.out.println(nums[j]);
        }
    }
}
