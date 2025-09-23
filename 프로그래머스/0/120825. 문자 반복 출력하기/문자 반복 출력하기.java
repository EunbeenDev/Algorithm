class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int size = my_string.length();
        
        for(int i=0; i<size; i++){
            String str = Character.toString(my_string.charAt(i));
            answer += str.repeat(n);
        }
        
        return answer;
    }
}