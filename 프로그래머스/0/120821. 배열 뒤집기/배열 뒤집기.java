class Solution {
    public int[] solution(int[] num_list) {
        int size = num_list.length;
        int[] answer = new int[size];
        int idx = 0;
        for(int i = size; i > 0; i--){
            answer[idx] = num_list[i-1];
            idx ++;
        }
        return answer;
    }
}