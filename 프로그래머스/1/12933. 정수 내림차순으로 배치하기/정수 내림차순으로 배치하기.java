import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        List<Integer> nums = new ArrayList<>();
        String[] s = String.valueOf(n).split("");
        for(String str : s){
            nums.add(Integer.parseInt(str));
        }
        
        Collections.sort(nums); Collections.reverse(nums); // 내림차순 정렬 
        StringBuilder sb = new StringBuilder();
        for(int i : nums){sb.append(String.valueOf(i));}
        
        return Long.parseLong(sb.toString());
    }
}