import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        
        List<String> s1List = new ArrayList<String>(Arrays.asList(s1));
        
        for(String s : s2){
            s1List.remove(s);
        }
        
        return s1.length - s1List.size();
    }
}