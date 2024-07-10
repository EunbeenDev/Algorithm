import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int totalGameNum = Integer.parseInt(st.nextToken());
        int playerNum = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int winScore = Integer.parseInt(st.nextToken());
        int loseScore = Integer.parseInt(st.nextToken());
        int finalScore = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> player = new HashMap<>();

        for(int i=0; i<playerNum; i++){
            st = new StringTokenizer(br.readLine());
            String pl = st.nextToken();

            if(st.nextToken().equals("W")) player.put(pl, winScore);
            else player.put(pl, -loseScore);
        }

        int score = 0;

        for(int i=0; i<totalGameNum; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();

            if(!player.containsKey(name) || player.get(name) < 0){
                score = (score - loseScore <= 0) ? 0: score-loseScore;
                continue;
            }

            score += player.get(name);
            if(score >= finalScore){
                System.out.println("I AM NOT IRONMAN!!"); return;
            }
        }

        System.out.println("I AM IRONMAN!!");
    }

}