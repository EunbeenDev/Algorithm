class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        
        String[] sarr = my_string.split("");
        
        String num1_str = String.valueOf(my_string.charAt(num1));
        String num2_str = String.valueOf(my_string.charAt(num2));
        
        int idx = 0;
        for(String s : sarr){
            if(idx == num1){sb.append(num2_str);}
            else if(idx == num2){sb.append(num1_str);}
            else{sb.append(s);}
            idx++;
        }
        
        return sb.toString();
    }
}