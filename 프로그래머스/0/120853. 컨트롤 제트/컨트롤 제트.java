class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] input = s.split(" ");
        
        String pre = "";
        for(String str : input){
            if(str.equals("Z")){
                answer -= Integer.parseInt(pre);
            }
            else{
                answer += Integer.parseInt(str);
            }
            
            pre = str;
        }
        return answer;
    }
}