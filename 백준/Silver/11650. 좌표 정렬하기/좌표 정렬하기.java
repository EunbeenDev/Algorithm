
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        TreeMap<Integer, ArrayList<Integer>> coord = new TreeMap<>();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // TreeMap에서 해당 x 좌표에 대한 ArrayList를 가져오거나 생성
            ArrayList<Integer> list = coord.getOrDefault(x, new ArrayList<>());
            list.add(y);
            coord.put(x, list);
        }

        // TreeMap을 순회하면서 각 x 좌표에 대한 y 좌표를 정렬하여 출력
        for (Map.Entry<Integer, ArrayList<Integer>> entry : coord.entrySet()) {
            int x = entry.getKey();
            ArrayList<Integer> yList = entry.getValue();
            Collections.sort(yList);
            for (int y : yList) {
                System.out.println(x + " " + y);
            }
        }
    }
}