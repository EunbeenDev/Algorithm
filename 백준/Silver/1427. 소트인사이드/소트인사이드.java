import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String intput=br.readLine();
        int len=intput.length();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<len; i++){
            arr.add(Integer.parseInt(String.valueOf(intput.charAt(i))));
        }
        Collections.sort(arr);
        for(int i=len-1;i>=0;i--){
            System.out.print(arr.get(i));
        }
    }
}