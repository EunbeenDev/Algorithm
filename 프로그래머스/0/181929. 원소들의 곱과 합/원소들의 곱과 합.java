class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sum = 0;
        int multi = 1;
        
        
        for( int a : num_list){
            sum += a;
            multi *= a;
        }
        
        if(multi < sum*sum){answer = 1;}
        else {answer = 0;}
        
        
        return answer;
    }
}