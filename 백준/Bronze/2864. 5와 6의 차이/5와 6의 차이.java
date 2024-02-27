
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1=sc.next();
        String input2=sc.next();
        ArrayList arr1=new ArrayList<>();
        ArrayList arr2=new ArrayList<>();

        int sum=Integer.parseInt(input1)+Integer.parseInt(input2);
        int max=sum;
        int min=sum;
        
        for(int i=0; i<input1.length(); i++){
            arr1.add(Character.toString(input1.charAt(i)));
        }
        for(int i=0; i<input2.length(); i++){
            arr2.add(Character.toString(input2.charAt(i)));
        }
        
        Collections.reverse(arr1);
        Collections.reverse(arr2);

        //10^i
        // 최댓값은 sum + (10^i) //charAt(i)==5일 때 최댓값에 적용
        // 최솟값은 sum - (10^i) //charAt(i)==6일 때 최솟값에 적용
        for(int i=0; i< arr1.size(); i++){
            if(arr1.get(i).equals("5")){max+=Math.pow(10,i);}
            if(arr1.get(i).equals("6")){min-=Math.pow(10,i);}
        }
        for(int i=0; i< arr2.size(); i++){
            if(arr2.get(i).equals("5")){max+=Math.pow(10,i);}
            if(arr2.get(i).equals("6")){min-=Math.pow(10,i);}
        }

        System.out.print(min+" "+max);
    }
}
