class Solution {
    public int solution(int n) {
        int[] fac = new int[11];
        fac[0] = 0; fac[1] = 1;
        
        if(n==0 || n==1){return n;}
        for(int i=2; i<=10; i++){
            fac[i]=fac[i-1]*i;
        
            if(n<fac[i]){return i-1;}
            else if(n==fac[i]){return i;}
        }
        
        return -1;
        
    }
}