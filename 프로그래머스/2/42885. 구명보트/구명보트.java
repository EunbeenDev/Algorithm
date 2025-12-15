import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        List<Integer> weights = new ArrayList<>();
        for(int p : people){weights.add(p);}
        // 오름차순 정렬
        Collections.sort(weights);
        int startIdx=0;
        int endIdx=weights.size()-1;
        while(startIdx<=endIdx){
            int bigW=weights.get(startIdx);
            int smallW=weights.get(endIdx);
            if(startIdx == endIdx){answer++; break;}
            if(bigW+smallW > limit){
                endIdx--; answer++;
            }
            else{startIdx++; endIdx--; answer++;}
        }
        return answer;
    }
}