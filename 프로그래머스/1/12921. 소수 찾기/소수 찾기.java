class Solution {
    public int solution(int n) {
        int answer=0;
        for(int i=1; i<=n; i++){
            if(isPrime(i)){answer++;}
        }
        return answer;
    }
    
    private boolean isPrime(int n){
        if(n==1){return false;}
        if(n==2){return true;}
        for(int i=2; i<Math.sqrt(n)+1; i++){
            if(n%i==0){return false;}
        }
        return true;
    }
}