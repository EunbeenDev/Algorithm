class Solution {
    public int solution(String my_string) {
        
        String[] sarr = my_string.split(" ");
        int answer = Integer.parseInt(sarr[0]);
        for(int i = 1; i<sarr.length; i+=2){
            int operand = Integer.parseInt(sarr[i+1]);
            
            switch(sarr[i]){
                case("+"):
                    answer += operand;
                    break;
                case("-"):
                    answer-= operand;
                    break;
            }
        }
        return answer;
    }
}