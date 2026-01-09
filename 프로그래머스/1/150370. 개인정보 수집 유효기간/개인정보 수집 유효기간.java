import java.util.*;
class Solution {
    int todayDate;
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> privMap = new HashMap<>();
        for(String t : terms){
            privMap.put(
                t.split(" ")[0], Integer.parseInt(t.split(" ")[1]));
        }
        
        // 2000.01.01 -> 0번째 날
        todayDate = calculateDays(today);
        
        int idx = 0;
        for(String p : privacies){
            int getPrivDays = calculateDays(p.split(" ")[0]);
            int privTermDays = privMap.get(p.split(" ")[1])*28;
            if(getPrivDays + privTermDays <= todayDate){result.add(idx);}
            // System.out.println(getPrivDays + " " + privTermDays);
            idx++;
        }
        
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i)+1;
        }
        
        return answer;
    }
    
    private int calculateDays(String date){
        int[] dateArr = new int[3];
        int idx=0;
        for(String d : date.split("\\.")){dateArr[idx] = Integer.parseInt(d); idx++;}
        return (dateArr[0]-2000)*336 + (dateArr[1])*28 + dateArr[2]-1;
        
    }
}