import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr = new String[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.next();
        }

        HashSet<String> temp = new HashSet<>();
        for(int i = 1; i <= arr[0].length(); i++){
            for(int j = 0; j < n; j++){
                temp.add(arr[j].substring(arr[0].length() - i));
            }
            if(temp.size() == n){
                System.out.println(i);
                return;
            }
            temp.clear();
        }
    }
}