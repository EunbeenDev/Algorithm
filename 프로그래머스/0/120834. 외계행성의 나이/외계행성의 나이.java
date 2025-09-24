class Solution {
    public String solution(int age) {
        String[] str = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String answer = "";
        boolean flag = false;
        
        int cnt = 0;
        
        if(age>=1000){cnt = 3;}
        else if(age>=100){cnt = 2;}
        else if(age>=10){cnt = 1;}
        else{cnt = 0;}
        
        for(int i=cnt; i>=0; i--){
            int div_num = (int)Math.pow(10,i);
            answer+=str[age/div_num];
            age %= div_num;
        }
        return answer;
    }
}