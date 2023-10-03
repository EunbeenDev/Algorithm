package week2;
//Bronze_더하기 사이클
import java.util.*;

public class BOJ_1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int firstNum = n;
        int cycle = 0;

        while (true) {
            String k = undertenPzero(n);
            String newNum = makeNewNum(k);
            cycle++;
            int newNumInt = Integer.parseInt(newNum);

            if (newNumInt == firstNum) {
                System.out.println(cycle);
                break;
            } else {
                n = newNumInt;
            }
        }
    }

    public static String undertenPzero(int n) {
        if (n < 10) {
            return "0" + n;
        } else {
            return String.valueOf(n);
        }
    }

    public static String rangeK1(int k1) {
        if (k1 < 10) {
            return String.valueOf(k1);
        } else {
            String k1Str = String.valueOf(k1);
            return k1Str.substring(k1Str.length() - 1);
        }
    }

    public static String makeNewNum(String k) {
        int k1 = Character.getNumericValue(k.charAt(0)) + Character.getNumericValue(k.charAt(1));
        String k1Str = rangeK1(k1);
        return k.charAt(1) + k1Str;
    }
}
