import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Collections.reverseOrder());  //내림차순 정렬
        
        int total = 0;
        for (int i = 0; i < n; i++) {
            total = Math.max(total, arr[i] * (i+1));
        }
        
        System.out.print(total);
    }
}