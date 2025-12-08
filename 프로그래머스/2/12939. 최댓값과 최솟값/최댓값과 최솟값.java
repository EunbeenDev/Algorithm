import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        List<Integer> nums = new ArrayList<>();
        for(String strNum : s.split(" ")){
            nums.add(Integer.parseInt(strNum));
        }
        Collections.sort(nums);
        return String.format("%d %d",nums.get(0), nums.get(nums.size()-1));
    }
}