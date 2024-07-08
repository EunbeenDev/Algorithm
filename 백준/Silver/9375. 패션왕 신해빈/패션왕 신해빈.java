import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            int M= Integer.parseInt(br.readLine());
            HashMap<String, Integer> hm = new HashMap<>();

            for(int j=0; j<M; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken(); // 같은 이름의 의상은 존재하지 않으므로, 옷의 이름은 필요없다.
                String type= st.nextToken();

                hm.put(type, hm.getOrDefault(type, 1)+1);

            }

            int result=1;
            for(String key: hm.keySet()){
                result*= hm.get(key);
            }
            System.out.println(result-1);
        }
    }
}