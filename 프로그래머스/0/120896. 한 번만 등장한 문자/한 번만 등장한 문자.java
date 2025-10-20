import java.util.*;

class Solution {
    public String solution(String s) {
        List<String> sList = new ArrayList<>();
        
        while(!s.equals("")){
            String str = String.valueOf(s.charAt(0));
            
            if(s.length() - (s.replace(str, "")).length() == 1){ 
                // 해당 문자열이 한 번만 등장한 경우
                sList.add(str);
            }
            
            s = s.replace(str, "");
        }
        Collections.sort(sList); // 사전 순으로 정렬
        
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<sList.size(); i++){
            sb.append(sList.get(i));
        }
        
        return sb.toString();
    }
}