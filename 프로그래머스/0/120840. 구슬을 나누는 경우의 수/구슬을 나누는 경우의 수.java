class Solution {
    int answer = 0;;
    public int solution(int balls, int share) {
        // balls: 갖고 있는 구슬 수
        // share: 나눠줄 구슬 수
        int[] arr  = new int[balls];
        for(int i=0; i<balls; i++){arr[i]=i;}
        boolean[] visited = new boolean[balls];
        
        combination(arr, visited, 0, balls, share);
        return answer;
    }
    
    public void combination(int[] arr, boolean[] visited, int start, int n, int r){
        if(r == 0){
            answer ++;
            return;
        }
        else{
            for(int i=start; i<n; i++){
                visited[i] = true;
                combination(arr, visited, i+1, n, r-1);
                visited[i] = false;
            }
        }
    }
}