class Solution {
    public int solution(int[] nums) { // 2이상의 짝수는 소수가 될 수 없음
        // 소수가 될 가능성이 있는 조합: 짝2홀1 || 홀3
        int answer = 0;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(isPrime(sum)){answer++;}
                    
                }
            }
        }
        return answer;
    }
    private boolean isPrime(int n){
        if(n%2==0){return false;}
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){return false;}
        }
        return true;
    }
}