import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int N=Integer.parseInt(br.readLine());
            int point1=0;
            int point2=0;
            for(int j=0; j<N; j++){
                StringTokenizer st=new StringTokenizer(br.readLine());
                String i1=st.nextToken();
                String i2=st.nextToken();
                if(i1.equals(i2)){continue;}
                if(i1.equals("R")){ //주먹
                    if(i2.equals("S")){point1++;}
                    else{point2++;}
                } else if (i1.equals("S")) {//가위
                    if(i2.equals("P")){point1++;}
                    else{point2++;}
                } else{ //보
                    if(i2.equals("R")){point1++;}
                    else{point2++;}
                }
            }
            if(point1>point2){System.out.println("Player 1");}
            else if(point1==point2){System.out.println("TIE");}
            else{System.out.println("Player 2");}
        }
    }
}