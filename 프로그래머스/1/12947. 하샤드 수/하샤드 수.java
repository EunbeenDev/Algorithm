
class Solution {
    public boolean solution(int x) {
        int x_cl = x;
        int l = String.valueOf(x).length();
        int summ = 0;
        for(int i=0; i<l; i++){
            summ += x%10; x/=10;
        }
        
        return x_cl%summ==0? true:false;
    }
}