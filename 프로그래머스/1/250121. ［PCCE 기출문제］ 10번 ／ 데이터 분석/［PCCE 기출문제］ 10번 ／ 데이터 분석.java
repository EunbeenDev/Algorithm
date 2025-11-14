import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> ex_data = new ArrayList<>();
        int ex=0;
        int s;
        // code, date, maximum, remain
        if(ext.equals("code")){ex=0;}
        else if(ext.equals("date")){ex=1;}
        else if(ext.equals("maximum")){ex=2;}
        else{ex=3;}
        
        if(sort_by.equals("code")){s=0;}
        else if(sort_by.equals("date")){s=1;}
        else if(sort_by.equals("maximum")){s=2;}
        else{s=3;}
        
        for(int[] v : data){
            if(v[ex]<val_ext){ex_data.add(new int[] {v[0], v[1], v[2], v[3]});}
        }
        
        int[][] ans = new int[ex_data.size()][4];
        for(int i=0; i<ex_data.size();i++){
            ans[i]=ex_data.get(i);
        }
        
        Arrays.sort(ans, (o1,o2)->{
            return o1[s]-o2[s];
        });
        
        return ans;
    }
}