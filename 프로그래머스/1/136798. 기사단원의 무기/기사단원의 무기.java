class Solution {
    public int solution(int number, int limit, int power) {
        int ans = 0;
        if(number==1){return 1;}
        
        for(int i=1; i<=number; i++){
            ans += divCnt(i,limit,power);
        }
        return ans;
    }
    
    private int divCnt(int n, int l, int p){
        if(n==1){return 1;}
        int cnt = 2;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){ // i가 약수인 경우
                if(n/i!=i){cnt+=2;}
                else{cnt++;}
            }
            if(cnt>l){return p;} // 제한수치를 넘을 경우 return p
        }
        return cnt;
    }
}