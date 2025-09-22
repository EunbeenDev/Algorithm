import java.util.*;
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        
        for(int n : numbers){sum += n;}
        
        answer = sum / numbers.length;
        return answer;
    }
}