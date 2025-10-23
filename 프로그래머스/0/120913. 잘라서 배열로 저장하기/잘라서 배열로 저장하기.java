import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        List<String> l = new ArrayList<>();
        int idx = 0;
        int s = my_str.length();
        while(true){
            if(idx+n >= s){
                l.add(my_str.substring(idx,s));
                break;
            }
            else{
                l.add(my_str.substring(idx,idx+n));
                idx += n;
            }
        }
        
        String[] answer = new String[l.size()];
        for(int i=0; i<l.size(); i++){
            answer[i] = l.get(i);
        }
        return answer;
    }
}