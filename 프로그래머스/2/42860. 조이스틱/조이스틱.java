class Solution {
    String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public int solution(String name) {
        int answer = 0;
        // 위아래 이동 비용
        for(int i=0; i<name.length(); i++){
            answer += upDown(name, i);
        }
        // 좌우 이동 총비용
        answer+=rightLeft(name);
        return answer;
    }
    
    // 조이스틱 위아래 이동
    private int upDown(String name, int i){
        return Math.min(26-alp.indexOf(name.charAt(i)), alp.indexOf(name.charAt(i)));
    }
    
    // 조이스틱 좌우 이동 총 비용
    private int rightLeft(String name){
        int len = name.length();
        int move = len-1;
        for(int i=0; i<name.length(); i++){
            int next=i+1; // 다음 글자의 인덱스

            while(next < len && name.charAt(next)=='A'){
                next++;
            }
            // 오른쪽으로 갔다가 다시 돌아가는 경우 vs 왼쪽으로 갔다가 다시 돌아가는 경우 vs 오른쪽으로 쭉 가는 경우
            move = Math.min(move, i*2+len-next);
            move = Math.min(move, (len-next)*2+i);
        }
        return move;
    }
}