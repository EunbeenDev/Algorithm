class Solution {
    int remove_zero=0;
    int steps=0;
    
    public int[] solution(String s) {
        int[] answer = new int[2];
        remove0(s);
        answer[0]=steps; answer[1]=remove_zero;
        return answer;
    }
    
    private void remove0(String b){
        String result = b.replaceAll("0","");
        steps++;
        remove_zero += b.length()-result.length();
        System.out.println(remove_zero);
        if(result.length()==1){return;}
        convertBinary(result.length());
    }
    
    private void convertBinary(int l){
        remove0(Integer.toString(l,2));
    }
}