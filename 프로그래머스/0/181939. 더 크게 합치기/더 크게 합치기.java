import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int a, int b) {
        
        String strA = a + "";
        String strB = b + "";
    
        
        int case1 = Integer.parseInt(strA + strB);
        int case2 = Integer.parseInt(strB + strA);
        
        return Math.max(case1,case2);
        
    }
}