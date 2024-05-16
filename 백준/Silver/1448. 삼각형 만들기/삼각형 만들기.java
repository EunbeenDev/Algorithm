import java.io.*;
import java.util.*;

// 삼각형의 조건(가장 긴변 < 나머지 변의 합)
// 순서대로 3개가 삼각형에 성립하지 않았다면 그 이하의 변의 조합에서는 성립할 수 없다.
// 따라서, 나머지 2개 변의 조합은 탐색할 필요가 없다.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        ArrayList<Integer> straws=new ArrayList<>();

        for(int i=0; i<N; i++){straws.add(Integer.parseInt(br.readLine()));}
        straws.sort(Collections.reverseOrder());

        int result=-1;

        for(int i=0; i<N-2; i++){
            int max=straws.get(i);
            int mid=straws.get(i+1);
            int min=straws.get(i+2);

            if(max<mid+min){result=max+mid+min; break;}
        }
        System.out.println(result);
    }
}
