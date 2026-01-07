import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> wordSet = new HashSet<>();
        char pre_char = words[0].charAt(words[0].length()-1);
        wordSet.add(words[0]);
        for(int i=1; i<words.length; i++){
            String w = words[i];
            // 끝말잇기 가능한 경우
            if(w.charAt(0)==pre_char && !wordSet.contains(w)){
                wordSet.add(w);
                pre_char = w.charAt(w.length()-1); // pre_char 갱신
            }
            // 탈락한 경우
            else{
                answer[0] = (i%n==0) ? 1 : i%n+1;
                answer[1] = i/n+1;
                break;
            }
        }
        return answer;
    }
}