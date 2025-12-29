import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        int[][] priors = new int[priorities.length][2]; // [프로세스 번호, 우선순위]
        int prior_step=0; // 우선순위 순서
        for(int i=0; i<priorities.length; i++){
            priors[i][0]=i+1; priors[i][1]=priorities[i];
            dq.add(i+1);
        }
        
        Arrays.sort(priors,(o1,o2)->{ // 우선순위 기준 내림차순 정렬
            return o2[1]-o1[1];
        });
        
        
        while(prior_step != priorities.length){
            int first = dq.getFirst();
            if(priorities[first-1]==priors[prior_step][1]){
                result.add(first);
                dq.poll(); prior_step++;
            }
            else{dq.add(first); dq.poll();} // 뒤로 넘기기
        }
        // System.out.println(result);
        return result.indexOf(location+1)+1;
    }
}