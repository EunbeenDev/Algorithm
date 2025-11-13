class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] bab = {"aya", "ye", "woo", "ma"};
        for(String s : babbling){
            for(String b : bab){
                if(s.contains(b.repeat(2))){break;} // 연속된 발음이면 X
                
                s=s.replace(b," ");
            }
            if((s.replace(" ", "")).length()==0){answer++;}
        }
        return answer;
    }
}