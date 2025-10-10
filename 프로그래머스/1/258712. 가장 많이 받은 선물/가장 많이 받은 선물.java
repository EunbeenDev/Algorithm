import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        
        List<String> f = Arrays.asList(friends);
        int fsize = f.size();

        int[][] g_and_r = new int[fsize][fsize];
        
        for(String s : gifts){
            String giver = s.split(" ")[0];
            String reciever = s.split(" ")[1];
            int g_idx = f.indexOf(giver);
            int r_idx  = f.indexOf(reciever);
            
            g_and_r[g_idx][r_idx] ++;
            
        }
        
        int[][] giftPointList = getGiftPointList(g_and_r, fsize);
        
        // 1:1로 선물 주고받은 수를 비교
        // g_and_r에서 a<->b, b<->c, ... g_and_r[i][n]로 비교
        // i, n이 같은 경우는 self이므로 제외
        
        // 각자 받는 선물 수를 저장하는 배열
        int[] giftCnt = new int[fsize];
        
        for(int i = 0; i<fsize; i++){ // i = giver
            for(int j = 0; j<fsize; j++){ // j = reciever
                if(i==j){break;}
                if(g_and_r[i][j] > g_and_r[j][i]){ 
                    // i가 준 선물 수가 더 큰 경우 -> i가 선물을 받아야 함
                    giftCnt[i]++;
                }
                else if(g_and_r[i][j] < g_and_r[j][i]){ 
                    // i가 준 선물 수가 더 작은 경우 -> j가 선물을 받아야 함
                    giftCnt[j]++;
                }
                else{ // 주고 받은 선물 수가 같은 경우 -> 선물 지수를 비교해 판단
                    if(giftPointList[i][2] > giftPointList[j][2]){ // i의 선물 지수가 더 큼
                        giftCnt[i]++; // i가 선물을 받아야 함
                    }
                    else if(giftPointList[i][2] < giftPointList[j][2]){ // j의 선물 지수가 더 큼
                        giftCnt[j]++; // j가 선물을 받아야 함
                    }
                    else{continue;} // 선물 지수가 같은 경우
                }
            }
        }
        
        return Arrays.stream(giftCnt).max().getAsInt();
    }
    
    public int[][] getGiftPointList(int[][] g_and_r, int fsize){
        int[][] giftPointList = new int[fsize][3];
        for(int i = 0; i<fsize; i++){
            giftPointList[i][0] = Arrays.stream(g_and_r[i]).sum();
            
            final int col = i;
            giftPointList[i][1] = Arrays.stream(g_and_r)
            .mapToInt(row -> row[col])
            .sum();
            
            giftPointList[i][2] = giftPointList[i][0] - giftPointList[i][1];
        }
        return giftPointList;
    }
}