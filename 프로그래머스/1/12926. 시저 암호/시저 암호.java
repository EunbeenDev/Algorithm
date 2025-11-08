import java.util.*;
class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c==' '){sb.append(" ");}
            else if(Character.isLowerCase(c)){ // 소문자인 경우
                sb.append(String.valueOf(
                    alphabets.charAt((alphabets.indexOf(c)+n)%26)).toLowerCase());
            }
            else{ // 대문자인 경우
                sb.append(String.valueOf(
                    alphabets.charAt((alphabets.indexOf(
                        Character.toLowerCase(c))+n)%26)).toUpperCase());
            }
        }
        return sb.toString();
    }
}