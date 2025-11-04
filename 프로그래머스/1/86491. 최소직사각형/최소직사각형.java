class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int w_max = 0; // 가로 최대값
        int h_max = 0; // 세로 최대값
        for(int[] s : sizes){
            int w = s[0]; int h = s[1]; 
            // 가로/세로 중 긴 방향을 가로 방향으로 회전
            if(s[0]<=s[1]){s[0]=h; s[1]=w;}
            // 회전 후 가로/세로 각각 최대값 업데이트
            w_max = Math.max(w_max, s[0]); 
            h_max = Math.max(h_max, s[1]);
        }
        
        return w_max * h_max;
    }
}
