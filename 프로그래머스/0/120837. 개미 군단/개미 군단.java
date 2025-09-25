class Solution {
    public int solution(int hp) {
        // 장군: 5, 병정: 3, 일: 1
        int answer = 0;
        int power = 5;
        while(hp>0){
            answer += hp/power;
            hp = hp%power;
            power -=2;
        }
        return answer;
    }
}