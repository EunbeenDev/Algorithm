class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int boardXMin = 0-board[0]/2;
        int boardXMax = board[0]/2;
        int boardYMin = 0-board[1]/2;
        int boardYMax = board[1]/2;
        
        
        for(String s : keyinput){
            
            switch(s){
                case("up"):
                    if(answer[1]+1<=boardYMax){answer[1]++;}
                    break;
                case("down"):
                    if(answer[1]-1>=boardYMin){answer[1]--;}
                    break;
                case("left"):
                    if(answer[0]-1>=boardXMin){answer[0]--;}
                    break;
                case("right"):
                    if(answer[0]+1<=boardXMax){answer[0]++;}
                    break;
            }
        }
        return answer;
    }
}