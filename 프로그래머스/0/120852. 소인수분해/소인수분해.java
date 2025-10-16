import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int idx = 0;
        for(int i=2; i<=n; i++){
            if(isPrime(i) && n%i==0){
                ans.add(i); }
            idx++;
        }
        
        
        int[] answer = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
    
    // 소수 판별 메소드
    public boolean isPrime(int n){
        if (n < 2) return false; // 1은 소수가 아님
        for (int i = 2; i <= n / 2; i++){
            if (n % i == 0) return false; // 나눠지면 소수 X
        }
        return true; // 끝까지 안 나눠지면 소수
    }
}