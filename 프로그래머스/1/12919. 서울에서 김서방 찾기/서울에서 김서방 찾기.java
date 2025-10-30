class Solution {
    public String solution(String[] seoul) {
        int idx = 0;
        for(String e : seoul){
            if(e.equals("Kim")){
                break;
            }
            idx++;
        }
        return String.format("김서방은 %d에 있다", idx);
    }
}