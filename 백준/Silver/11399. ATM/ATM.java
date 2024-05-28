import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] time = new int[N];

        for(int i=0; i<N; i++){
            time[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time);
        // 누적 시간 및 결과 계산
        int accum = 0;
        int result = 0;
        for (int i = 0; i < N; i++) {
            accum += time[i];
            result += accum;
        }
        System.out.println(result);
    }
}