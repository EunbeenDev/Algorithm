
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1부터 차례대로 숫자를 더해 S보다 큰 값을 찾고, count-1이 결과
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        long sum = 0;
        int count = 0;

        for(int i=1; ; i++) {
            if(sum > num)	break;
            sum += i;
            count ++;
        }
        System.out.println(count-1);
    }
}