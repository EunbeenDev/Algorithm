class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String empty = " ";
        String[] lan = {"aya", "ye", "woo", "ma"};
        for(String b : babbling){
            for(String l : lan){
                b = b.replace(l, " ");
            }
            if(b.equals(empty.repeat(b.length()))) {answer++;}
        }
        return answer;
    }
}