import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int len = topping.length;
        Map<Integer, Integer> rightTopp = new HashMap<>();
        Map<Integer, Integer> leftTopp = new HashMap<>();
        
        for (int x : topping) {
            if(rightTopp.containsKey(x)){rightTopp.put(x, rightTopp.get(x)+1);}
            else{rightTopp.put(x, 1);}
        }

        for(int i=0; i<topping.length; i++){
            int topp=topping[i];
            if(rightTopp.get(topp)==1){
                rightTopp.remove(topp);
            }
            else{rightTopp.put(topp, rightTopp.get(topp)-1);}
            
            
            if(leftTopp.containsKey(topp)){leftTopp.put(topp, leftTopp.get(topp)+1);}
            else{leftTopp.put(topp, 1);}
            
            if(rightTopp.size()==leftTopp.size()){answer++;}
            
        }
        return answer;
    }
}