class Solution {
    public int solution(int age) {
        int year = 2022;
        
        while(age > 1){ // 태어나자마자 1살
            year--;
            age--;
        }
        
        return year;
    }
}