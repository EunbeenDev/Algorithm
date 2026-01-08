// 13:18
import java.util.*;
class Solution {
    public int[] solution(String s) {
        s=s.replaceAll("[\\{\\}]",""); // 괄호 제거
        Map<Integer, Integer> numMap = new HashMap<>(); // <요소, 요소의 개수>
        for(String n : s.split(",")){
            int num = Integer.parseInt(n);
            if(numMap.containsKey(num)){numMap.put(num, numMap.get(num)+1);}
            else{numMap.put(num,1);}
        }
        
        int[] answer = new int[numMap.size()];
        int[][] mapToArray = new int[numMap.size()][2];
        int idx = 0;
        for(int k : numMap.keySet()){
            mapToArray[idx][0] = k;
            mapToArray[idx][1] = numMap.get(k);
            idx++;
        }
        
        Arrays.sort(mapToArray, (o1,o2)->{
            return o2[1]-o1[1]; // 요소의 개수 기준 내림차순 정렬
        });
    
        for(int i=0; i<mapToArray.length; i++){
            answer[i]=mapToArray[i][0];
        }
        return answer;
    }
}