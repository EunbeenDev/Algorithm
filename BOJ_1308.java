import java.util.*;
public class BOJ_1308 {

    static int[] day(int year){
        int[] month_days={31,28,31,30,31,30,31,31,30,31,30,31}; //평년 기준
        if(year%4==0 || year%100!=0 || year%400==0){ month_days[1]=29; }
        return month_days;
    }

//    1/1/1 ~ y/m/d 총 날짜 수
    static int sum_days(int y, int m, int d){
        int result=0;
        int[] days;

        for(int i=1; i<y; i++){
            days=day(i); //위치 선언
            for(int j=0; j<12; j++){
                result+=days[j]; //i년 12개월 동안의 날짜수 합
            }
        }

        days=day(y);
        for(int i=0; i<m-1; i++){
            result+=days[i];
        }
        result+=d;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // today
        int today_y = sc.nextInt();
        int today_m = sc.nextInt();
        int today_d = sc.nextInt();
        // D-Day date
        int d_y = sc.nextInt();
        int d_m = sc.nextInt();
        int d_d = sc.nextInt();

        // is gg
        if ((d_y - today_y > 1000) || (d_y - today_y == today_m && d_d >= today_d))
            System.out.println("gg");
        else {
            long t = sum_days(today_y, today_m, today_d);
            long d = sum_days(d_y, d_m, d_d);
            System.out.println("D-" + (d - t));
        }

    }
}
