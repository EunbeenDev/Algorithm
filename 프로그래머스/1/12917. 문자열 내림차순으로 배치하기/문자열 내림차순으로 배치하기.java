import java.util.*;
class Solution {
    public String solution(String s) {
        String[] sarr = s.split("");
        Arrays.sort(sarr);
        StringBuilder sb = new StringBuilder();
        for(int i=sarr.length-1; i>=0; i--){
            sb.append(sarr[i]);
        }
        
        return sb.toString();
    }
}