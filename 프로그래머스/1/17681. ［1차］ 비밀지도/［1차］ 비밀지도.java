class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[][] arr1_map = new String[n][n];
        String[][] arr2_map = new String[n][n];
        
        for(int i=0; i<n; i++){
            // 2진수로 변환
            arr1_map[i] = convertBinaryLengthN(arr1[i], n).split("");
            arr2_map[i] = convertBinaryLengthN(arr2[i], n).split("");
        }
        
        // 1 = 벽(#), 0 = 공백(" ")
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder(); // 각 줄에 대한 값
            for(int j=0; j<n; j++){
                if(arr1_map[i][j].equals("1") || arr2_map[i][j].equals("1")){
                    sb.append("#");
                }
                else {sb.append(" ");}
            }
            answer[i]=sb.toString();
        }
        return answer;
    }
    
    private String convertBinaryLengthN(int i, int n){
        String b = Integer.toString(i,2);
        if(b.length()<n){
            System.out.println("0".repeat(n-b.length()) + b);
            return ("0".repeat(n-b.length()) + b);
        }
        return b;
    }
}