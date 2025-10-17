import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        LinkedHashSet<Character> hs = new LinkedHashSet();
        char[] carr = my_string.toCharArray();
        
        for(char c : carr){
            hs.add(c);
        }
        
        for(char c : hs){
            answer += String.valueOf(c);
        }
        
        return answer;
    }
}