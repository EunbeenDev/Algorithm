import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String st=br.readLine();
        ArrayList<Character> arr=new ArrayList<>();
        int zero=0;
        int one=0;
        for(int i=0; i<st.length();i++){
            if(i!=0){
                if(st.charAt(i)!=st.charAt(i-1)){arr.add(st.charAt(i));}
            }else{arr.add(st.charAt(i));}
        }

        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)=='1'){one++;}
            else{zero++;}
        }
        System.out.println(Math.min(one,zero));
    }
}