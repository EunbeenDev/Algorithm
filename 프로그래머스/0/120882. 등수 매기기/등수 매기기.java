import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int s = score.length;
        int[] ans = new int[s];
        
        for(int i=0; i<s; i++){
            score[i][0]=score[i][0]+score[i][1]; score[i][1]=i; // score[영어+수학][인덱스]
        }
        
        Arrays.sort(score,(o1,o2) -> { // 영어+수학 점수를 기준으로 내림차순 정렬
            return o2[0]-o1[0];
        });
        
        int r = 1;
        int pre = score[0][0]; 
        for(int i=0; i<s; i++){
            
            if(i==0){ // 첫 실행
                ans[score[i][1]] = r;
                pre = score[i][0];
            }
            else{ // 공동 등수인지 확인
                if(score[i][0]!=pre){ // 공동 등수가 아닌 경우
                    r = i+1; // r값을 i+1로 업데이트
                    pre = score[i][0]; //pre값 업데이트
                }
                ans[score[i][1]]=r;
            }
            
        }
        return ans;
    }
}