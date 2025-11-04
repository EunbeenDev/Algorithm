import java.util.*;
class Solution {
    public int[] solution(String s) {
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> m = new HashMap<>(); // key: 글자, value: 최신 인덱스
        for(int i=0; i<s.length(); i++){
            if(!m.containsKey(s.charAt(i))){ // 처음 등장하는 글자인 경우
                ans.add(-1); 
            }
            else{ // 이미 등장한 글자인 경우
                ans.add(i - m.get(s.charAt(i))); // 현재 인덱스 - 최근 인덱스
            }
            m.put(s.charAt(i),i); // value를 현재 인덱스로 업데이트
        }
        
        int[] answer = new int[ans.size()]; 
        for(int i=0; i<ans.size(); i++){
            answer[i]=ans.get(i);
        }
        return answer;
    }
}