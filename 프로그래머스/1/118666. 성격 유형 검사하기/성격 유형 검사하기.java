import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        
        Map<Character, Integer> test = new HashMap<>();
        // A,N,R,T,F,C,M,J 각 점수
        // Key(유형), value(점수)
        test.put('A',0); test.put('N',0); test.put('R',0); test.put('T',0); 
        test.put('F',0); test.put('C',0); test.put('M',0); test.put('J',0);
        
        int[] score = {0,3,2,1,0,1,2,3};
        for(int i=0; i<survey.length; i++){
            if(choices[i]<=4){
                test.put(survey[i].charAt(0), test.get(survey[i].charAt(0)) + score[choices[i]]);
            }
            else{test.put(survey[i].charAt(1), test.get(survey[i].charAt(1)) + score[choices[i]]);}
        }
        
        StringBuilder sb = new StringBuilder();
        
        if(test.get('R')>=test.get('T')){sb.append('R');} else{sb.append('T');}
        if(test.get('C')>=test.get('F')){sb.append('C');} else{sb.append('F');}
        if(test.get('J')>=test.get('M')){sb.append('J');} else{sb.append('M');}
        if(test.get('A')>=test.get('N')){sb.append('A');} else{sb.append('N');}
        return sb.toString();
    }
}