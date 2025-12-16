class Solution {
    public int solution(int n) {
        int next_n=n+1;
        int cnt_one = countOne(n);
        while(true){
            if(cnt_one == countOne(next_n)){return next_n;}
            else{next_n++;}
        }
    }
    
    private int countOne(int n){
        String n_binary = Integer.toString(n,2);
        return n_binary.length() - n_binary.replace("1","").length();
    }
}