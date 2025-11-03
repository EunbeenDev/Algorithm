import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(Math.min(n,m), Math.max(n,m));
        answer[1] = lcm(Math.min(n,m), Math.max(n,m));
        
        return answer;
    }
    
    // 최소공배수
    private int lcm(int a, int b){ // a <= b
        for(int i=b; i<=a*b; i+=b){
            if(i%a==0){return i;}
        }
        return 0;
    }
    
    // 최대공약수
    private int gcd(int a, int b){ // a <= b
        for(int i=a; i>=1; i--){
            if(a%i==0 && b%i==0){return i;}
        }
        return 0;
    }
    
}