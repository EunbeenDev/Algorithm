import java.util.*;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String k_str = String.valueOf(k);
        
        StringBuilder sb = new StringBuilder();
        
        List<String> l = new ArrayList<>();
        for(int n=i; n<=j; n++){
            sb.append(String.valueOf(n));
        }
        
        return sb.length() - sb.toString().replace(k_str, "").length();
    }
}