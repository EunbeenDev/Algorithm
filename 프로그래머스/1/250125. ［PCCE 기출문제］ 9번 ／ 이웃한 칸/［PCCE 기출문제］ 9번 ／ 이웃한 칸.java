class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;
        String color = board[h][w];
        // 상하좌우 좌표
        int[] dh = {0,1,-1,0};
        int[] dw = {1,0,0,-1};
        for(int i=0; i<=3; i++){
            int c_h = h+dh[i];
            int c_w = w+dw[i];
            if((0<=c_h && c_h<n) && (0<=c_w && c_w<n)){
                if(board[c_h][c_w].equals(color)) answer++;
            }
        }
        return answer;
    }
}