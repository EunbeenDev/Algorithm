import java.util.*;
class Solution {
    String[] unPair = {")", "}", "]"};
    public int solution(String s) {
        int answer = 0;
        Deque<String> dq = new ArrayDeque<>();
        for(String p : s.split("")){dq.addLast(p);}
        
        for(int i=0; i<s.length(); i++){
            // 올바른 괄호인지 확인
            if(isCorrect(dq)){answer++;}
            // 회전
            dq.addLast(dq.getFirst());
            dq.removeFirst();
        }
        return answer;
    }
    
    private boolean isCorrect(Deque<String> d){
        Deque<String> dq = new ArrayDeque<>(d);
        Deque<String> pair = new ArrayDeque<>();
        
        if(dq.size()<=1){return false;}
        if(dq.getFirst().equals(")")||
           dq.getFirst().equals("}")||
           dq.getFirst().equals("]")){return false;}
        pair.addLast(dq.poll());
        
        while(dq.size()>0){
            if(pair.size()==0){
                pair.addLast(dq.getFirst());
                dq.removeFirst();
                continue;
            }
            String p=dq.getFirst();
            dq.removeFirst();
            switch(p){
                case(")"):
                    if(pair.getLast().equals("(")){
                        pair.removeLast();
                    }else{pair.addLast(p);}
                    break;
                case("}"):
                    if(pair.getLast().equals("{")){
                        pair.removeLast();
                    }else{pair.addLast(p);}
                    break;
                case("]"):
                    if(pair.getLast().equals("[")){
                        pair.removeLast();
                    }else{pair.addLast(p);}
                    break;
                default:
                    pair.addLast(p);
                    break;
            }
        }
        if(pair.size()==0){return true;}
        return false;
    }
}