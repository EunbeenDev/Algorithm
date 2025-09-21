class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        if(n%2==0){ // n이 짝수인 경우
            answer = new int[n/2];
        }
        else{ // n이 홀수인 경우
            answer = new int[n/2+1];
        }
        int idx = 0;
        for(int i=1; i<=n; i+=2){
            answer[idx] = i;
            idx ++;
        }
        
        return answer;
    }
}