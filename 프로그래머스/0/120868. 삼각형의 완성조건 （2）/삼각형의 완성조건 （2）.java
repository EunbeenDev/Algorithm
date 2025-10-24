import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int max = sides[1];
        // 가장 긴 변의 길이가 max인 경우
        // 나머지 한 변의 범위: (max-다른 한 변) 초과 && max 이하
        answer += max - (max-sides[0]);
        
        // 가장 긴 변이 나머지 한 변인 경우
        // 나머지 한 변의 범위: max 초과 (max+다른 한 변) 미만
        answer += (max+sides[0]) - max - 1;
        
        return answer;
    }
}