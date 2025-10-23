import java.util.*;
class Solution {
    public String solution(String polynomial) {
        
        String answer = "";
        String[] poly = polynomial.split(" ");
        
        int x_num = 0;
        int num = 0;
        
        for(String s : poly){
            if(s.equals("+")){continue;}
            if(s.contains("x")){
                if(s.equals("x")){
                    x_num += 1;
                }
                else{
                    x_num += Integer.parseInt(s.replace("x",""));
                }
            }
            else{num += Integer.parseInt(s);}
        }
        
        
        if(num==0 && x_num!=0){
            if(x_num==1){
                answer = String.format("x");
            }
            else{
                answer = String.format("%dx", x_num);}
        }
        else if(num!=0 && x_num!=0){
            if(x_num==1){
                answer = String.format("x + %d", num);
            }
            else{
                answer = String.format("%dx + %d", x_num, num);
            }
        }
        else{
            answer = String.format("%d",num);
        }
        return answer;
    }
}