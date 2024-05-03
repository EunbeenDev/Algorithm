import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rnum = scanner.nextLine();
        char[] num_list = rnum.toCharArray();
        int[] count_list = new int[10];
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] == '9') {
                num_list[i] = '6';
            }
        }
        
        int six = 0;
        for (char c : num_list) {
            if (c == '6') {
                six++;
            }
        }
        
        if (six % 2 == 0) {
            count_list[6] = six / 2;
        } else {
            count_list[6] = six / 2 + 1;
        }
        
        for (char c : num_list) {
            if (c != '6') {
                count_list[Character.getNumericValue(c)]++;
            }
        }
        
        int maxCount = 0;
        for (int count : count_list) {
            maxCount = Math.max(maxCount, count);
        }
        
        System.out.println(maxCount);
    }
}
