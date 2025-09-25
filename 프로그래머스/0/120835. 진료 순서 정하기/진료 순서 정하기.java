import java.util.*;

class Solution {
    public int[] solution(int[] e) {
        int size = e.length; 
        int[] s =  e.clone();
        Arrays.sort(s);
        
        int[] answer = new int[size];
        
        for(int i=0; i<size; i++){ 
            for(int j=0; j<size; j++){
                if(e[i]==s[j]){
                    answer[i] = size-j;
                    break;
                }
            }
        }
        return answer;
    }
}