import java.util.*;
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        char[] carr = my_string.toCharArray();
        
        for(char c : carr){
            String s = Character.toString(c);
            if(!s.equals(letter)){answer += s;}
        }
        
        return answer;
    }
}