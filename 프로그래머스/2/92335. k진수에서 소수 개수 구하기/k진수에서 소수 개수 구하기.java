import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer=0;
        if(n==1){return 0;}
        String n_to_k = Integer.toString(n,k);
        for(String str_num : n_to_k.split("0")){
            if(str_num.equals("")){continue;}
            if(isPrime(Long.parseLong(str_num))){
                answer++;
            }
        }
        return answer;
    }
    private boolean isPrime(long n){
        if(n==1 || n==0){return false;}
        if(n==2){return true;}
        for(long i=2; i<Math.sqrt(n)+1; i++){
            if(n%i==0){return false;}
        }
        return true;
    }
}