import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 브실이가 수강한 과목 수
        int M = Integer.parseInt(st.nextToken()); // 브실대학에서 요구하는 과목 수
        int K = Integer.parseInt(st.nextToken()); // 브실대학에서 공개한 과목 수

        Map<String, Integer> courseMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String courseName = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            courseMap.put(courseName, score);
        }

        List<String> requiredCourses = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            requiredCourses.add(br.readLine());
        }

        // 점수들에 대한 배열 생성
        List<Integer> scores = new ArrayList<>(courseMap.values());

        int minScore = 0;
        int maxScore = 0;
        
        for (String course : requiredCourses) {
            if (courseMap.containsKey(course)) {
                int score = courseMap.get(course);
                minScore += score;
                maxScore += score;
                scores.remove((Integer) score);
            }
        }

        // 남은 점수 정렬
        Collections.sort(scores);

        // 남은 점수 중 최소값을 더함
        for (int i = 0; i < M - K; i++) {
            minScore += scores.get(i);
        }
        // 남은 점수 중 최대값을 더함
        for (int i = 0; i < M - K; i++) {
            maxScore += scores.get(scores.size() - 1 - i);
        }

        System.out.println(minScore + " " + maxScore);
    }
}
