class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        // arr2를 회전
        // arrMult의 인자 길이를 같게 만들기 위함
        int[][] rot_arr2 = new int[arr2[0].length][arr2.length];
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                rot_arr2[j][i]=arr2[i][j];
            }
        }
        
        // 배열의 곱 수행
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<rot_arr2.length; j++){
                int[] a1 = arr1[i];
                int[] a2 = rot_arr2[j];
                
                answer[i][j] = arrMult(a1,a2);
            }
        }
        return answer;
    }
    
    // a1.length == a2.length
    private int arrMult(int[] a1, int[] a2){
        int result=0;
        for(int i=0; i<a1.length; i++){
            result += a1[i]*a2[i];
        }
        return result;
    }
}