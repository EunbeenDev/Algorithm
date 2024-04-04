import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int cnt = Integer.parseInt(br.readLine());
            long d[] = new long[cnt+1];
            d[0] = 0;
            d[1] = 1;
            for (int i = 2; i <= cnt; i++){
                d[i] = d[i-1] + d[i-2];
            }
            System.out.println(d[cnt]);
    }
}