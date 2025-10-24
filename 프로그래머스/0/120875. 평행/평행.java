import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        // 기울기 = y축 증가량 / x축 증가량
        
        // 교차곱 사용
        int x1=dots[0][0]; int x2=dots[1][0]; int x3=dots[2][0]; int x4=dots[3][0]; 
        int y1=dots[0][1]; int y2=dots[1][1]; int y3=dots[2][1]; int y4=dots[3][1]; 
        
        if((x1-x2)*(y3-y4) == (x3-x4)*(y1-y2)||
          (x1-x3)*(y2-y4) == (x2-x4)*(y1-y3)||
          (x1-x4)*(y2-y3) == (x2-x3)*(y1-y4)
          ){return 1;}
        
        return 0;
    }
}