import java.util.*;
class Solution {
    public long solution(int[] arr) {
        long answer = 0;
        if(arr.length==1){return arr[0];}
        
        Arrays.sort(arr);
        int maxN=arr[arr.length-1];
        answer+=maxN;
        long limit = 1;
        for(int i:arr){limit*=i;} // 상한
        while(answer<=limit){
            boolean flag = true;
            
            for(int i:arr){
                if(answer%i!=0){flag=false; break;}
            }
                
            if(!flag){answer+=maxN;}
            else{break;}
        }
        return answer;
    }
}