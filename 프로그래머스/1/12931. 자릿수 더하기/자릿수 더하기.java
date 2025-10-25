import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String[] nstr = (String.valueOf(n)).split("");
        for(String s : nstr){
            answer+=Integer.parseInt(s);
        }

        return answer;
    }
}