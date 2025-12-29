import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Deque<Character> dq = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(dq.size()==0){dq.add(c);}
            else{
                if(dq.getLast()==c){dq.removeLast();}
                else{dq.add(c);}
            }
        }
        if(dq.size()==0){return 1;}
        return 0;
    }
}