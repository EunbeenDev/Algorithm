import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        int[] x_num = new int[10];
        int[] y_num = new int[10];
        // 0-9까지의 숫자 개수 추가
        for(char c : X.toCharArray()){
            x_num[c-'0']++;
        }
        for(char c : Y.toCharArray()){
            y_num[c-'0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=9; i>=0; i--){
            int cnt = Math.min(x_num[i], y_num[i]);
            for(int j=0; j<cnt; j++){sb.append(i);}
        }
        
        if(sb.length()==0){return "-1";}
        if(sb.charAt(0)=='0'){return "0";}
        return sb.toString();
    }
}