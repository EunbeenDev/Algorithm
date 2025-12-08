import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int total = stages.length; // 전체 사용자 수
        int[] reach = new int[N+2];  // N+1 스테이지 포함
        double[][] fails = new double[N+1][2];  // 1~N 스테이지만 저장
        int[] answer = new int[N];

        // 각 스테이지에 머무는 사람 수 카운트
        for (int s : stages) {
            if (s <= N) reach[s]++;
        }

        // 실패율 계산
        int players = total;  // 해당 스테이지에 도달한 사람 수
        for (int i = 1; i <= N; i++) {
            fails[i][0] = i; // 스테이지 번호 저장

            if (players == 0) {
                fails[i][1] = 0; // 더 이상 도달한 사람이 없을 경우
            } else {
                fails[i][1] = (double) reach[i] / players;
            }
            players -= reach[i]; // 다음 스테이지 도달자 수 갱신
        }

        // 실패율 기준 정렬
        Arrays.sort(fails, 1, N+1, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return Double.compare(o1[0], o2[0]);
            }
            return Double.compare(o2[1], o1[1]); // 실패율 내림차순
        });

        // 답 저장
        for (int i = 1; i <= N; i++) {
            answer[i - 1] = (int) fails[i][0];
        }

        return answer;
    }
}
