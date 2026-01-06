class Solution {
    public int solution(String word) {
        int answer = 0;
        char[] charr = {'A', 'E', 'I', 'O', 'U'};
        int[] idx = {781, 156, 31, 6, 1};
        int word_len=word.length();
        
        for(int i=0; i<word_len; i++){
            char c = word.charAt(i);
            
            int charr_idx=0;
            for(int k=0; k<charr.length; k++){
                if(charr[k]==c){charr_idx = k; break;}
            }
            answer+=idx[i]*charr_idx + 1;
        }

        return answer;
    }
}