class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int step1 = 0;
        int step2 = 0;
        for(String g : goal){
            if(step1<cards1.length && g.equals(cards1[step1])){
                step1++;
            }
            else if(step2<cards2.length && g.equals(cards2[step2])){
                step2++;
            }
            else{return "No";}
            
        }
        return "Yes";
    }
}