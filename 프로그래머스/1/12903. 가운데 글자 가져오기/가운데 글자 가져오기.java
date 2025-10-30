class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int mid = s.length()/2;
        if(s.length()%2==0){
            sb.append(s.charAt(mid-1)); 
            sb.append(s.charAt(mid)); 
        }
        else{sb.append(s.charAt(mid)); }
        return sb.toString();
    }
}