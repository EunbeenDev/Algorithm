import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] sums = new int[3];
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i=0; i<answers.length; i++){
            int ans = answers[i];
            if(p1[i%5] == ans) {sums[0]++;}
            if(p2[i%8] == ans) {sums[1]++;}
            if(p3[i%10] == ans) {sums[2]++;}
        }
        
        List<Integer> a = new ArrayList<>();
        
        int maxx = Math.max(sums[0], (Math.max(sums[1],sums[2])));
        for(int i=0; i<3; i++){
            if(sums[i]==maxx){a.add(i);}
        }
        Collections.sort(a);
        int[] answer = new int[a.size()];
        for(int i=0; i<a.size(); i++){
            answer[i]=a.get(i)+1;
        }
        
        return answer;
    }
}