class Solution {
    public int solution(int a, int b) {
        
        int standard = Math.min(a,b);
        for(int i=1; i<=standard; i++){
            if(a%i==0 && b%i==0){a/=i; b/=i;} // 약분
        }
        
        while(b%2==0 || b%5==0){
            if(b%2==0){b/=2;}
            else{b/=5;}
        }
        
        return b!=1 ? 2 : 1;
    }
    
}