class Solution {
    int curr; int v_len; int op_s; int op_e;
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        curr = Integer.parseInt(pos.split(":")[0])*60 + Integer.parseInt(pos.split(":")[1]);
        v_len = Integer.parseInt(video_len.split(":")[0])*60 + Integer.parseInt(video_len.split(":")[1]);
        op_s = Integer.parseInt(op_start.split(":")[0])*60 + Integer.parseInt(op_start.split(":")[1]);
        op_e = Integer.parseInt(op_end.split(":")[0])*60 + Integer.parseInt(op_end.split(":")[1]);
        
        
        if(isOpening()){ curr = op_e; }
        
        for(String c : commands){
            switch(c){
                case("next"):
                    next(); break;
                case("prev"):
                    prev(); break;
            }
            if(isOpening()){ curr = op_e; }
        }
        
        StringBuilder sb = new StringBuilder();
        if(curr/60 < 10){sb.append("0");} sb.append(curr/60); 
        sb.append(":");
        if(curr%60<10){sb.append("0");} sb.append(curr%60);
        
        return sb.toString();
    }
    
    private void next(){
        curr+=10;
        if(curr > v_len){curr=v_len;}
    }
    
    private void prev(){
        curr-=10;
        if(curr < 0){curr=0;}
    }
    
    private boolean isOpening(){
        if(curr >= op_s && curr <= op_e){return true;}
        return false;
    }
}