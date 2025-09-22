class Solution {
    public int solution(int n) {
        // n: 사람 수
        // answer: 피자 판 수
        // 피자 한 판은 6조각
        
        int pizza = 6; // 모든 피자 조각 수
        while(pizza % n != 0){
            pizza += 6; // 한 판 추가
        }
        
        return pizza / 6;
    }
}