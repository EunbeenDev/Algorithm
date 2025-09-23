class Solution {
    public int solution(int n, int k) {
        k = k - n/10; // 10인분 당 음료수 1개 감소
        return  12000 * n + 2000 * k;
    }
}