class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        // 두 분수를 기약 분수로 만들기
        for(int i = denom1; i > 0; i--){
            if(numer1 % i == 0 && denom1 % i == 0) {numer1 /=i; denom1/=i;}
        }
        for(int i = denom2; i > 0; i--){
            if(numer2 % i == 0 && denom2 % i == 0) {numer2 /= i; denom2 /= i;}
        }
        
        loop:
        for(int i=1; i<=denom2; i++){ // 더하는 수의 분모보다 작게 실행
            for(int j=1; j<=denom1; j++){
                if (denom1*i == denom2*j){
                    
                    answer[0] = numer1*i + numer2*j;
                    answer[1] = denom1*i;
                    
                    if(answer[0] % answer[1] == 0){ // 결과가 자연수가 되는 경우
                        answer[0] = answer[0] / answer[1];
                        answer[1] = 1;
                    }
                    break loop;
                    
                }
            }   
        }
        
        int numer = answer[0];
        int denom = answer[1];
        
        // 기약분수
        for(int i = denom; i > 0; i--){
            if(numer % i == 0 && denom % i == 0) {answer[0] /= i; answer[1] /= i;}
        }
        
        return answer;
    }
}