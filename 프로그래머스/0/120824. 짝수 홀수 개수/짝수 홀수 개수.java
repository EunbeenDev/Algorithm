class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2]; // 짝수 개수, 홀수 개수
        
        for(int n : num_list){
            answer[n%2==0?0:1]++;
        }
        return answer;
    }
}