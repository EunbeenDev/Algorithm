class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] strArr = (String.valueOf(n)).split("");
        for(String s : strArr){
            answer+=Integer.parseInt(s);
        }
        return answer;
    }
}