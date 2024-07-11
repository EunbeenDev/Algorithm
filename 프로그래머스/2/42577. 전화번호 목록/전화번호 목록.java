import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        ArrayList<String> nums = new ArrayList<>();
        for (String str : phone_book) {
            nums.add(str);
        }
        Collections.sort(nums); // 전화번호 목록을 정렬합니다.
        
        for (int i = 0; i < nums.size() - 1; i++) {
            String s = nums.get(i);
            int leng = s.length();
            
            // 다음 번호가 현재 번호보다 짧으면 continue
            for (int j = i + 1; j < nums.size(); j++) {
                String l = nums.get(j);
                if (l.length() < leng) {
                    continue;
                }
                // 다음 번호의 앞 부분이 현재 번호와 동일한지 확인
                if (l.substring(0, leng).equals(s)) {
                    return false; // 접두어 관계가 있으면 false 반환
                } else {
                    break; // 더 이상 비교할 필요가 없으므로 루프를 벗어납니다.
                }
            }
        }
        return true; // 접두어 관계가 없으면 true 반환
    }
}
