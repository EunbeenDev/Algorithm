class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2]; // [아메리카노 잔 수, 잔돈]
        int price = 5500;
        
        answer[0] = money/price;
        answer[1] = money - price*answer[0];
        
        return answer;
    }
}