class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // 가로 x 세로 = brown + yellow
        int surf = brown + yellow;
        // 테두리 칸 수 = 2*가로 + 2*세로 - 4
        for(int i=1; i<=surf; i++){ // i=가로
            if(surf%i==0 && i >= surf/i){
                int j=surf/i; // 세로
                if(brown == i*2+j*2-4){
                    answer[0]=i; answer[1]=j; break;
                }
            }
        }
        return answer;
    }
}