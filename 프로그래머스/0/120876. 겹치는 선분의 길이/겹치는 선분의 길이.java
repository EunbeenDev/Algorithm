import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int size = 3;
        int flag = 0; // 겹친 횟수
        
        for(int i=0; i<2; i++){ // arr1=[a,b], arr2=[c,d]
            int[] arr1 = lines[i]; // 0, 1
            int a = arr1[0]; int b = arr1[1];
            
            int idx = i+1;
            while(idx < 3){ // 1, 2
                int[] arr2 = lines[idx];
                int c = arr2[0]; int d = arr2[1];
                
                if(a<=c && b>c && b<=d){answer += Math.abs(b-c); flag++;}
                else if(a<=c && b>c && b>d){answer += Math.abs(d-c); flag++;}
                else if(a>=c && a<d && b<=d){ answer += Math.abs(b-a); flag++;}
                else if(a>=c && a<d && b>d){ answer += Math.abs(d-a); flag++;}
                
                idx++;
            }
        }
        
        // 3개 모두 겹치는 부분 제외
        if(flag == 3){
            int[] start = {lines[0][0], lines[1][0], lines[2][0]};
            int[] end = {lines[0][1], lines[1][1], lines[2][1]};
            Arrays.sort(start); Arrays.sort(end);
            answer -= Math.abs(end[0]-start[2])*2;
        }
        
        
        return answer;
    }
}