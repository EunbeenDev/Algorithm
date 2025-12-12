import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Set<Integer> s = new HashSet<>();
        for(int t : tangerine){s.add(t);}
        Map<Integer, Integer> m = new HashMap<>();
        Iterator<Integer> it = s.iterator();
        // Map 생성
        for(int i=0; i<s.size(); i++){
            m.put(it.next(), 0);
        }
        // 각 크기마다 귤의 개수 업데이트
        for(int t : tangerine){
            m.put(t, m.get(t)+1);
        }
        
        // map을 정렬하기 위해 배열로 변환
        int[][] tangs = new int[s.size()][2];
        Iterator<Integer> it2 = s.iterator();
        for(int i=0; i<s.size(); i++){
            tangs[i][0] = it2.next();
            tangs[i][1] = m.get(tangs[i][0]);
        }
        // 귤 개수 기준으로 내림차순 정렬
        Arrays.sort(tangs, (o1,o2) ->{
            return o2[1]-o1[1];
        });
        
        for(int[] n : tangs){
            k-=n[1];
            answer++;
            if(k<=0){break;}
        }
        return answer;
    }
}