import java.util.*;
class Solution {
    public String solution(int n, int t, int m, int p) {
        // String answer = "";
        StringBuilder sb = new StringBuilder();
        List<Character> num_chars = new ArrayList<>();
        num_chars.add('0');
        int num=0;
        while(num_chars.size() < t*m){
            for(char c : toBaseN(num, n)){
                num_chars.add(Character.toUpperCase(c));
            }
            num++;
        }
        int idx=p;
        for(int i=1; i<=t; i++){
            sb.append(num_chars.get(idx));
            idx+=m;
        }
        return sb.toString();
    }
    
    private char[] toBaseN(int num, int radix){
        return Integer.toString(num, radix).toCharArray();
    }
    
}