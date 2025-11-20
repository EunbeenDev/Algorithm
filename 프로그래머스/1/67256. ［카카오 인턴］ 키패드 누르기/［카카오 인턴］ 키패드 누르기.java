class Solution {
    public int[][] k = {{1,2,3}, {4,5,6}, {7,8,9},{-1,0,-1}};
    
    public String solution(int[] numbers, String hand) {
        
        StringBuilder sb = new StringBuilder();
        int rightnum=-1; int leftnum=-1;
        for(int n : numbers){
            if(n!=0 && n%3==0){sb.append("R"); rightnum=n;} // 3,6,9
            else if(n%3==1){sb.append("L"); leftnum=n;} // 1,4,7
            else{ // 거리 비교
                String result = compareDist(n,leftnum, rightnum, hand);
                if(result.equals("L")){leftnum=n;}
                else{rightnum=n;}
                sb.append(result);
            }
        }
        return sb.toString();
    }
    
    // 거리 구하는 방법
    // (i1-i2) + (j1-j2)
    private String compareDist(int n, int l, int r, String hand){
        int[] dn = dist(n);
        int[] dl = dist(l);
        int[] dr = dist(r);
        
        if(Math.abs(dn[0]-dl[0])+Math.abs(dn[1]-dl[1])<Math.abs(dn[0]-dr[0])+Math.abs(dn[1]-dr[1])){
            return "L";
        }
        else if(Math.abs(dn[0]-dl[0])+Math.abs(dn[1]-dl[1])>Math.abs(dn[0]-dr[0])+Math.abs(dn[1]-dr[1])){
            return "R";
        }
        else{
            if(hand.equals("right")){return "R";}
            else{return "L";}
        }
        
    }
    
    private int[] dist(int n){
        int[] d = new int[2];
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                if(k[i][j]==n){d[0]=i; d[1]=j; return d;}
            }
        }
        return d;
    }
}