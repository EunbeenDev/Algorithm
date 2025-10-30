import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int minn = arr[0];
        
        for(int i:arr){minn=Math.min(minn, i);} // 최소값 구하기
        for(int i:arr){if(minn!=i){ans.add(i);}} // 최소값이 아닌 요소만 add
        
        if(ans.size()==0){ans.add(-1);} // 빈 배열일 경우 처리
        
        int[] answer = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
}