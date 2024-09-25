import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Integer[] arr = new Integer[8];
        Integer[] orr = new Integer[8];
        Integer[] answer = new Integer[5];
        
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            orr[i] = arr[i];
        }
        Arrays.sort(orr, Comparator.reverseOrder());
        
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += orr[i];
            
            for (int j = 0; j < 8; j++) {
                if (orr[i].equals(arr[j])) {
                    answer[i] = j + 1;
                }
            }
        }
        Arrays.sort(answer);
        System.out.println(sum);
        for (int k = 0; k < 5; k++) {
            System.out.print(answer[k] + " ");
        }
    }
}
