class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int l = phone_number.length();
        if(l==4){return phone_number;}
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<l-4; i++){
            sb.append("*");
        }
        sb.append(phone_number.substring(l-4, l));
        
        return sb.toString();
    }
}