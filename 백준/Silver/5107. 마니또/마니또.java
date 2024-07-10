
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNum = 1;

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;

            Map<String, String> map = new HashMap<>();
            Set<String> allNames = new HashSet<>();
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                String a = st.nextToken();
                String b = st.nextToken();
                map.put(a, b);
                allNames.add(a);
                allNames.add(b);
            }

            Set<String> visited = new HashSet<>();
            int cycleCount = 0;

            for (String start : allNames) {
                if (!visited.contains(start)) {
                    if (isCycle(start, map, visited)) {
                        cycleCount++;
                    }
                }
            }

            bw.write(caseNum + " " + cycleCount + "\n");
            caseNum++;
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isCycle(String start, Map<String, String> map, Set<String> visited) {
        Set<String> stack = new HashSet<>();
        String current = start;

        while (current != null) {
            if (stack.contains(current)) {
                return true;
            }
            if (visited.contains(current)) {
                return false;
            }

            stack.add(current);
            visited.add(current);
            current = map.get(current);
        }

        return false;
    }
}
