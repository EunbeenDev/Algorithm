//Silver_그룹 단어 체커
import java.util.*;
public class BOJ_1316 {

    private static boolean isGroup(String str) {
        Set<Character> set = new HashSet<>();
        char prevChar = 0; //변수 초기화

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (prevChar != currentChar) {
                if (set.contains(currentChar)) {
                    return false; // 현재 문자가 이미 나왔던 문자-> 그룹 단어 X
                }
                set.add(currentChar);
            }
            prevChar = currentChar;
        }

        return true; //그룹 단어 O
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int t = 0; t < n; t++) {
            String str = sc.next();
            if (isGroup(str)) { cnt++; }
        }
        System.out.println(cnt);
    }
}
