class Solution {
    boolean[][] map;
    // 현재 위치
    int r=0;
    int c=0;
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        map = new boolean[park.length][park[0].length()];
        // map 생성
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[i].length(); j++){
                if(park[i].charAt(j)=='S'){r=i; c=j; map[i][j]=true;}
                else if(park[i].charAt(j)=='O'){map[i][j]=true;}
                else{map[i][j]=false;}
            }
        }
        
        // 명령 수행
        for(String c : routes){
            String op = c.split(" ")[0];
            int n = Integer.parseInt(c.split(" ")[1]);
            move(op, n);
        }
        answer[0] = r;
        answer[1] = c;
        return answer;
    }
    
    private boolean move(String op, int n){
        switch(op){
            case("E"): // 동쪽 방향으로 이동
                for(int i=1; i<=n; i++){
                    if(c+i> map[0].length-1){return false;}
                    if(!map[r][c+i]){return false;}
                }
                c+=n;
                return true;
            case("W"):
                for(int i=1; i<=n; i++){
                    if(c-i<0){return false;}
                    if(!map[r][c-i]){return false;}
                }
                c-=n;
                return true;
            case("S"):
                for(int i=1; i<=n; i++){
                    if(r+i> map.length-1){ return false;}
                    if(!map[r+i][c]){return false;}
                }
                r+=n;
                return true;
            case("N"):
                for(int i=1; i<=n; i++){
                    if(r-i<0){return false;}
                    if(!map[r-i][c]){return false;}
                }
                r-=n;
                return true;
        }
        return false;
    }
}