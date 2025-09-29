class Solution {
    public int solution(int[] numbers, int k) {
        int size = numbers.length;
        int start = 1;
        for(int i = 1; i<k; i++){
            start += 2;
            if(start==size+1){start = 1;}
            else if(start==size+2){start = 2;}
        }
        return start;
    }
}