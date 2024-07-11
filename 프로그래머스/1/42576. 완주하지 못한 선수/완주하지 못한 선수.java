import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자 명단을 해시맵에 저장
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        // 완주자 명단을 해시맵에서 차감
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        // 값이 1인 키를 찾음 (완주하지 못한 선수)
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                return key;
            }
        }
        
        return ""; // 모든 선수가 완주한 경우 (문제 조건 상 해당 없음)
    }
}
