import java.util.*;
import java.util.stream.Collectors;


class Solution {
    public int solution(int[] sides) {
        List<Integer> sList = Arrays.stream(sides).boxed()
            .collect(Collectors.toList());
        
        Collections.sort(sList);
        if(sList.get(2)<sList.get(0)+sList.get(1)){
            return 1;
        }
        else{return 2;}
        
    }
}