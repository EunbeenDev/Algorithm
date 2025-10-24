class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for(String d : dic){
            boolean valid = true;
            for(String s : spell){
                // 한 글자라도 없으면 다음 사전으로 넘어감
                if(!d.contains(s)){valid = false; break;}
            }
            if(valid){return 1;}
        }
        
        return 2;
        
    }
}