class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        int idx = 0;
        for(String s : quiz){
            String[] exp = s.split(" ");
            if(exp[1].equals("-")){
                if(Integer.parseInt(exp[4]) == Integer.parseInt(exp[0]) - Integer.parseInt(exp[2])){
                    answer[idx] = "O";
                }
                else{answer[idx] = "X";}
            }
            else{
                if(Integer.parseInt(exp[4]) == Integer.parseInt(exp[0]) + Integer.parseInt(exp[2])){
                    answer[idx] = "O";
                }
                else{answer[idx] = "X";}
            }
            
            idx++;
        }
        
        return answer;
    }
}