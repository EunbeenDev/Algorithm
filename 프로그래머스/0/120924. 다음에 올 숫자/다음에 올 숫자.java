class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int s = common.length;
        if(common[0]-common[1] == common[1]-common[2]){ // 등차수열인 경우
            int d = common[1]-common[0]; // 공차 d
            answer = common[s-1] + d;
        }
        else{ // 등비수열
            int r = common[1]/common[0];
            answer = common[s-1] * r;
            
        }
        
        return answer;
    }
}