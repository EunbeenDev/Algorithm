import java.util.*;

public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
        
       int screen[]=new int[n];
       int basket[]=new int[m];
       
       int left=0,right=left+m-1;//인덱스: 바구니 위치
       int j = sc.nextInt();
       int distance=0;
       
        for(int i=0; i<j; i++){
           int apple=sc.nextInt()-1;//사과 위치 정보
           if(apple<left){
               int diff=left-apple; //사과와 바구니 거리차이
               distance+=diff; //바구니 왼쪽으로 이동
               left-=diff; right-=diff;
           }
           else if(apple>right){
               int diff=apple-right; 
               distance+=diff; //바구니 오른쪽 이동
               right+=diff; left+=diff;
           }
       }
       System.out.println(distance);
    }
}