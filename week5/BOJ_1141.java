package week5;
//Silver_접두사 *
import java.util.*;
public class BOJ_1141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] strArr = new String[n];

        for (int i=0; i<n; i++) {
            strArr[i] = sc.nextLine();
        }
        // 문자열 길이를 기준으로 내림차순으로 정렬
        Arrays.sort(strArr, (s1, s2) -> Integer.compare(s2.length(), s1.length()));

        HashSet<String> set = new HashSet<>();
        for (String s1: strArr) {
            if (set.size() == 0) {
                set.add(s1);
                continue;
            }
            // set에 있는 문자열중에 s1을 포함하는게 있으면 추가X
            boolean available= true;
            for (String s2 : set) {
                if (s2.indexOf(s1) == 0) {available = false; break;}
            }
            if (available) { set.add(s1); }
        }
        System.out.println(set.size());
    }
}
