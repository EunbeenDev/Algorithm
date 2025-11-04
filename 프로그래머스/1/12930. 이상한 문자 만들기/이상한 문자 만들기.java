class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(int i=0; i<s.length(); i++){
            String c = String.valueOf(s.charAt(i));
            if(c.equals(" ")){sb.append(c); idx = 0;} // 공백을 만나면 idx 초기화
            else{
                if(idx%2==0){sb.append(c.toUpperCase());}
                else{sb.append(c.toLowerCase());}
                idx++;
            }
        }
        return sb.toString();
    }
}