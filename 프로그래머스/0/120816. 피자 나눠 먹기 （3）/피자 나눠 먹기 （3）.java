class Solution {
    public int solution(int slice, int n) {
        int tot_slice = slice;
        int tot_pizza = 1;
        
        while(tot_slice < n){
            tot_slice += slice;
            tot_pizza ++;
        }
        return tot_pizza;
        
    }
}