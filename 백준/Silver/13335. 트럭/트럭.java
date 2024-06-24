import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 트럭 수
        int L = Integer.parseInt(st.nextToken()); // 다리 길이
        int W = Integer.parseInt(st.nextToken()); // 다리 최대 무게

        Queue<Integer> trucks = new LinkedList<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            trucks.add(Integer.parseInt(st.nextToken()));
        }

        int currentTime = 0;
        int currentBridgeWeight = 0;
        Queue<Integer> bridge = new LinkedList<>();
        Queue<Integer> bridgeTime = new LinkedList<>();

        while (!trucks.isEmpty() || !bridge.isEmpty()) {
            currentTime++;

            if (!bridgeTime.isEmpty() && bridgeTime.peek() == currentTime) {
                bridgeTime.poll();
                currentBridgeWeight -= bridge.poll();
            }

            if (!trucks.isEmpty() && currentBridgeWeight + trucks.peek() <= W && bridge.size() < L) {
                int truck = trucks.poll();
                bridge.add(truck);
                bridgeTime.add(currentTime + L);
                currentBridgeWeight += truck;
            }
        }

        System.out.println(currentTime);
    }
}