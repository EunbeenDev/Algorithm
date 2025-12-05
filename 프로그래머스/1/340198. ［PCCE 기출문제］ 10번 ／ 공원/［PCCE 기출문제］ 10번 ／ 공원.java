import java.util.*;
class Solution {
    boolean[][] p;
    
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        p = new boolean[park.length][park[0].length];
        
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[0].length; j++){
                if(park[i][j].equals("-1")){p[i][j]=true;}
                else{p[i][j]=false;}
            }
        }
        Arrays.sort(mats); // 오름차순 정렬
        for(int i=mats.length-1; i>=0; i--){ // 크기가 큰 돗자리부터 탐색
            int n=mats[i];
            System.out.println(n);
            if(n>park.length || n >park[0].length){continue;}
            if(searchPlace(n)){return n;}
        }
        return -1;
    }
    
    private boolean searchPlace(int n){
        // p 배열 탐색
        boolean result=false;
        for(int i=0; i<=p.length-n; i++){
            for(int j=0; j<=p[0].length-n; j++){
                result = checkMat(i,j,n);
                if(result){return true;} // 돗자리를 놓을 수 있는 시작점을 찾았으면 바로 return
            }
        }
        return result;
    }
    // p[i][j] 지점을 시작으로 돗자리를 놓을 수 있는지 확인
    private boolean checkMat(int i, int j, int n){
        
        for(int k=0; k<n; k++){
            for(int l=0; l<n; l++){
                if(p[i+k][j+l]==false){return false;}
            }
        }
        return true;
    }
    
}