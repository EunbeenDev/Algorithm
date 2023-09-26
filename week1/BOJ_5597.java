package week1;
//Bronze_과제 안 내신 분..?
import java.util.*;

import static java.lang.Integer.parseInt;

public class BOJ_5597 {
//    출석번호 1-30
//    28명 제출/ 제출하지 않은 2명의 출석번호 구하기
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<Integer>();
        for(int i=0; i<30; i++){
            nums.add(i+1);
        }

        Scanner sc=new Scanner(System.in);

        for(int j=0; j<28; j++){
            nums.remove(Integer.valueOf(parseInt(sc.nextLine())));
        }

        if(nums.get(0) <= nums.get(1)){
            System.out.println(nums.get(0));
            System.out.println(nums.get(1));
        }
        else{
            System.out.println(nums.get(1));
            System.out.println(nums.get(0));
        }

    }
}
