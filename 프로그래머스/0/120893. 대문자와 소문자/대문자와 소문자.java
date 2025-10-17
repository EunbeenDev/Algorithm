class Solution {
    public String solution(String my_string) {
        String[] sArr = my_string.split("");
        
        StringBuffer sb = new StringBuffer();
        for(String s : sArr){
            // 소문자인 경우 -> toUpperCase
            if(s.matches("[a-z]")){
                sb.append(s.toUpperCase());
            }
            // 대문자인 경우 -> toLowerCase
            else{
                sb.append(s.toLowerCase());
            }
        }
        
        return sb.toString();
    }
}