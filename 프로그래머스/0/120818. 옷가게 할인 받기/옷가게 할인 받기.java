class Solution {
    public int solution(int price) {
        int answer = 0;
        int mark = price/100000;
        
        if(mark >= 5){return (int)(price * 0.8);}
        else if(mark >= 3){return (int)(price * 0.9);}
        else if(mark >= 1){return (int)(price * 0.95);}
        else {return price;}
    }
}