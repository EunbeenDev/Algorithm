class Solution {
    public String solution(String cipher, int code) {
        String full_cipher = " " + cipher; // 인덱스 맞추기 위해 0번째 글자에는 공백 추
        String answer = "";
        int gap = code;
        while(code<=cipher.length()){
            answer += full_cipher.charAt(code);
            code += gap;
        }
        return answer;
    }
}