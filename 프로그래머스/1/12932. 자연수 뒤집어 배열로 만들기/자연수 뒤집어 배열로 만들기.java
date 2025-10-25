class Solution {
    public int[] solution(long n) {
        
        int s = (String.valueOf(n)).length();
        int[] answer = new int[s];
        int idx = 0;
        while(n>=10){
            int num =(int) (n % 10); // 1의 자리
            answer[idx] = num;
            n /= 10;
            idx++;
        }
        answer[s-1] = (int) n;
        return answer;
    }
}