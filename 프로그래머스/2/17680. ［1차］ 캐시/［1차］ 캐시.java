import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if(cacheSize==0){return cities.length*5;}
        Deque<String> d = new ArrayDeque<>(); // Queue 형태로 사용
        
        for(String c : cities){
            c = c.toUpperCase();
            if(d.contains(c)){
                answer+=1;
                d.remove(c);
                d.addLast(c);
            }
            else{
                answer+=5;
                if(d.size() < cacheSize){
                    d.addLast(c);
                }
                else{
                    d.pollFirst();
                    d.addLast(c);
                }
            }
        }
        return answer;
    }
}