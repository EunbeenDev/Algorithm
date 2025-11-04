class Solution {
    public int solution(int n) {
        String triple = Integer.toString(n, 3); // 10진수를 3진수로 변환
        StringBuilder sb = new StringBuilder(triple);
        sb = sb.reverse(); // 문자열 뒤집기
        return Integer.parseInt(sb.toString(),3); // 3진수를 10진수로 변환
    }
}