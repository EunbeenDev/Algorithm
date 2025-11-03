class Solution {
    public boolean solution(String s) {
        String rep_s = s.replaceAll("[a-zA-Z]","");
        return (s.length()==rep_s.length()) && (s.length() == 4 || s.length() == 6)? true:false;
    }
}