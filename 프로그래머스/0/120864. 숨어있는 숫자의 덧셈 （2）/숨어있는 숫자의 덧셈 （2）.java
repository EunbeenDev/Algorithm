import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            String str = String.valueOf(my_string.charAt(i));
            if(str.matches("[a-zA-Z]")){sb.append(" ");}
            else{sb.append(str);}
        }
        
        String[] s = sb.toString().split(" ");
        for(String n : s){
            if(n.equals("")){continue;}
            answer += Integer.parseInt(n);
        }
        return answer;
    }
}