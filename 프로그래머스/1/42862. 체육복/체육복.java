import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] std = new int[n+1]; // std[0]=0, 체육복X : -1, 여분 체육복O : 1
        std[0]=-1;
        
        for(int i : lost){
            std[i]=-1;
        }
        for(int i : reserve){
            if(std[i]==-1){std[i]=0;}
            else{std[i]=1;}
        }
        
        for(int i=1; i<=n; i++){
            
            if(i==1){
                if(std[i]==1 && std[i+1]==-1){std[i+1]=0; std[i]=0;}
            }
            else if(i==n){
                if(std[i]==1 && std[i-1]==-1){std[i-1]=0; std[i]=0;}
            }
            else{
                if(std[i]==1){
                    if(std[i-1]==-1){std[i-1]=0; std[i]=0;continue;}
                    else if(std[i+1]==-1){std[i+1]=0; std[i]=0;}
                }
            }
        }
        for(int i:std){
            if(i>=0){answer++;}
        }
        return answer;
    }
}