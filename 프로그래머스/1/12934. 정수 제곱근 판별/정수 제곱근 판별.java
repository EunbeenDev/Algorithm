class Solution {
    public long solution(long n) {
        long sq = (long)Math.sqrt(n);
        return sq*sq==n ? (sq+1)*(sq+1) : -1 ;
    }
}