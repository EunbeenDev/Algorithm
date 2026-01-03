class Solution {
    public int solution(int n) {
        if(n==0){return 0;}
        if(n==1){return 1;}
        int sum=1;
        int ex1=0; int ex2=1;
        int ex3=0; //자신
        for(int i=2; i<=n; i++){
            ex3=(ex1+ex2)%1234567;
            ex1=ex2; ex2=ex3; 
            sum=ex3;
        }
        return sum%1234567;
    }
}