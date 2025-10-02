class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            if(isComplexNumber(i)){answer++;}
        }
        
        return answer;
        
    }
    
    public boolean isComplexNumber(int n){
        if(n==1 || n==2){return false;}
        int cnt = 0;
        
        int div = 2;
        while(div <= n/2){
            if(n%div == 0){ return true; }
            div++;
        }
        return false;
    }
}