import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> num_list = new ArrayList<>();
        for(int i : numbers){
            num_list.add(i);
        }
        
        Collections.sort(num_list);
        int n_size  = num_list.size();
        
        return Math.max(num_list.get(0)*num_list.get(1),
                       num_list.get(n_size-1)*num_list.get(n_size-2));
    }
}