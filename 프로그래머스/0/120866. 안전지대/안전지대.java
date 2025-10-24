class Solution {
    
    public int solution(int[][] b) {
        int answer = 0;
        int n = b.length;
        int[][] visit = new int[n+2][n+2]; // 가장자리 
        
        int[][] board = new int[n+2][n+2];
                
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i+1][j+1]=b[i][j];
            }
        }
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                // 지뢰인 경우: visit가 0인 경우 -> 주변 위험지대 처리 (+ 방문처리)
                // 위험지대인 경우: visit가 1인 경우 (방문처리 후 pass)
                // 만약 주변에 지뢰가 있을 경우 방문 처리 X
                if(board[i][j]==1 && visit[i][j]==0){ // 지뢰인 경우
                    for(int k=-1; k<=1; k++){ // 위험지대 처리
                        for(int l=-1; l<=1; l++){
                            if(board[i+k][j+l] != 1){ // 위험지대 처리 지역이 지뢰가 아닌 경우
                                board[i+k][j+l]=1; // 위험지대 처리
                                visit[i+k][j+l]=1; // 방문 처리
                            }
                        }
                    }
                }
                visit[i][j]=1; // 해당 위치 방문처리
            }
        }
        
        // 안전지대 count
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(board[i][j]==0){ // 안전지대인 경우
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
}