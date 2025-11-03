class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long p_num = Long.parseLong(p);
        int step = p.length();
        for(int i=0; i<=t.length()-step; i++){
            if(Long.parseLong(t.substring(i, i+step))<=p_num){answer++;} 
        }
        return answer;
        
    }
}