import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        if(N < 100){result = N;}
        else{
            result = 99;
            for(int i = 100; i <= N; i++){
                int h = i / 100;
                int t = (i / 10) % 10;
                int o = i % 10;

                if((t - o)==(h - t)){result++;}
            }
        }
        System.out.println(result);
    }
}