import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        int sum=0;
        ArrayList<Integer> nums=new ArrayList();
        int s=nums.size();
        for(int i=0; i<T; i++){
            int num=Integer.parseInt(br.readLine());
            if(num==0){sum-=nums.get(s-1); nums.remove(s-1); s--;}
            else{sum+=num; nums.add(num); s++;}
        }
        System.out.println(sum);
    }

}
