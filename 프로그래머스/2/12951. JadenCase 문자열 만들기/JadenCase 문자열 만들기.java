class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(i==0){
                if(c>='0'&&c<'9'){sb.append(c);}
                else{sb.append(String.valueOf(c).toUpperCase());}
            }
            else{
                if(s.charAt(i-1) == ' '){
                    sb.append(String.valueOf(c).toUpperCase());
                }
                else{sb.append(String.valueOf(c).toLowerCase());}
            }
        }
        return sb.toString();
    }
}