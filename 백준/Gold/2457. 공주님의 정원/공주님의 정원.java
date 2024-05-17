import java.io.*;
import java.util.*;

public class Main {

    public static int CalDate(String m, String d){
        return (Integer.parseInt(m))*100+Integer.parseInt(d);
    }

    public static void main(String[] args) throws IOException {
        final int start_date = 301;
        final int end_date = 1201;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        TreeMap<Integer, Integer> flowers = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = CalDate(st.nextToken(), st.nextToken());
            int end = CalDate(st.nextToken(), st.nextToken());

            if (flowers.get(start) == null || flowers.get(start) < end) {
                flowers.put(start, end);
            }
        }

        // 기준 날짜보다 먼저 피는(또는 기준 날짜와 같은 날짜에 피는) 꽃들 중에서 가장 늦게 지는 꽃을 찾았는가?
        boolean flag = false;

        int current_date = start_date;
        int result = 0;

        while (current_date < end_date) {
            int max = current_date; //현재 기준 날짜를 기준으로 가장 멀리 피어 있는 꽃의 end_date를 찾기 위함

            for (Map.Entry<Integer, Integer> entry : flowers.entrySet()) {
                // 꽃이 현재 기준 날짜보다 먼저 또는 동시에 피기 시작했는가? && 그 꽃의 종료 날짜가 현재 max 이후인가?
                if (entry.getKey() <= current_date && entry.getValue() > max) {
                    max = entry.getValue();
                    flag = true; //유요한 꽃
                }
            }

            if (flag) { // 유효한 꽃을 찾았다면, 기준을 가장 먼 날짜로 변경
                current_date = max;
                flag = false;
                result++;
            } else { // 유효한 꽃을 찾지 못한 경우 -> result=0;
                result = 0; break;
            }
        }
        System.out.println(result);
    }
}
