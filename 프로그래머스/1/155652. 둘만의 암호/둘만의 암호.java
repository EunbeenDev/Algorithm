class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        String alp = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<skip.length(); i++){ // apl에서 skip 제거
            alp=alp.replace(String.valueOf(skip.charAt(i)),"");
        }
        if(alp.length()==0){
            return s;
        }
        
        for(int i=0; i<s.length(); i++){
            String c = String.valueOf(s.charAt(i));
            int idx= alp.indexOf(c);
            if(idx+index-alp.length()>=alp.length()){
                sb.append(String.valueOf(alp.charAt(idx+index-alp.length()*2)));
            }
            else if(idx+index>=alp.length()){
                sb.append(String.valueOf(alp.charAt(idx+index-alp.length())));
            }
            else{
                sb.append(String.valueOf(alp.charAt(idx+index)));
            }
        }
        return sb.toString();
    }
}