class Solution {
    public long solution(int price, int money, int count) {
        long ans = money;
        for(int i=1; i<=count; i++){
            ans -= price * i;
        }

        return ans>=0 ? 0: 0-ans;
    }
}