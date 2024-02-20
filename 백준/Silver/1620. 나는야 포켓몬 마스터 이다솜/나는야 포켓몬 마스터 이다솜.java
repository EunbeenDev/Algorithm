import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> pokemonMap = new HashMap<>();
        ArrayList<String> pokemonList = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            pokemonMap.put(name, i);
            pokemonList.add(name);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (Character.isDigit(input.charAt(0))) {
                int index = Integer.parseInt(input);
                bw.write(pokemonList.get(index - 1) + "\n");
            } else {
                bw.write(pokemonMap.get(input) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
