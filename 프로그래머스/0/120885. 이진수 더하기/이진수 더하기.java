class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        int ten1 = Integer.parseInt(bin1,2);
        int ten2 = Integer.parseInt(bin2,2);
        
        int s = ten1+ten2;
        
        return Integer.toBinaryString(s);
    }
}