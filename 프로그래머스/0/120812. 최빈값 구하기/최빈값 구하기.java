
class Solution {
    public int solution(int[] array) {
        int[] idx_cnt= new int[1000]; //idx = 비교 숫자, elem = 빈도수
        
        int max = 0; // 최빈값의 빈도수
        int max_elem = 0; // 최빈값
        
        for(int elem : array){
            idx_cnt[elem]++;
            if(max < idx_cnt[elem]){
                max = idx_cnt[elem];
                max_elem = elem; // 빈도 최대값 갱신
            } 
        }
        
        int max_cnt = 0;
    
        for(int i : idx_cnt){
            if(i == max){max_cnt++;}
        }
        
        if(max_cnt > 1){return -1;} // 최빈값이 여러개인 경우
        else{ return max_elem; }
    }
}