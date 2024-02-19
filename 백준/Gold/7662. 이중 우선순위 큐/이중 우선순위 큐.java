import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            // 최소, 최대의 값을 가지고 있는 트리맵을 사용해 풀었다.
            // 이를 사용하면 최소나 최대를 제거하거나 가져올 때에 O(logn)밖에 시간이 걸리지 않아 기존보다 효율적일 것이라 생각하였다.
            // <값, 개수>를 갖는 tm생성
            TreeMap<Integer, Integer> tm = new TreeMap<>();
            int N = Integer.parseInt(br.readLine());
            
            for(int j=0; j<N; j++){
                String input[] = br.readLine().split(" ");
                String oper = input[0];
                int num = Integer.parseInt(input[1]);
                if(oper.equals("D")){
                    if(tm.isEmpty()) continue;
                    else if(num==1){      // 큰 수를 삭제하는 경우
                        int minNum = tm.lastKey();    // 제일 작은 수를 가져오고
                        int cntNum = tm.get(minNum);  // 그 수가 몇개 있는지 확인하여
                        if(cntNum == 1) tm.remove(minNum);  // 1개만 있으면 그냥 지우고
                        else tm.put(minNum, cntNum-1);      // 그보다 많으면 숫자를 하나 줄여준다.
                    }else{              // 작은수도 로직은 똑같다.
                        int minNum = tm.firstKey();
                        int cntNum = tm.get(minNum);
                        if(cntNum == 1) tm.remove(minNum);
                        else tm.put(minNum, cntNum-1);
                    }
                }else{
                    tm.put(num, tm.getOrDefault(num, 0)+1);   // 현재 수를 입력하고, 없으면 생성, 있으면 cnt늘리기
                }
            }
            if(tm.isEmpty()) System.out.println("EMPTY");
            else System.out.println(tm.lastKey() + " " + tm.firstKey());
        }

    }
}