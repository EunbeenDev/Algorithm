import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings,(a,b) -> {
            if (a.charAt(n) == b.charAt(n)) {
                return a.compareTo(b);  // n번째 문자가 같을 때, 전체 문자열 사전순 비교
            } else {
                return Character.compare(a.charAt(n), b.charAt(n));
            }
        });
        
        
        return strings;
    }
}