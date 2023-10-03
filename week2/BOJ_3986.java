package week2;
// Silver_좋은 단어
import java.util.*;
public class BOJ_3986 {
    public static boolean isGoodWord(String word) {
        int length = word.length();
        if (length % 2 != 0) {
            return false;
        }

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < length; i++) {
            if (!st.isEmpty() && st.peek() == word.charAt(i)) {
                st.pop();
            } else {
                st.push(word.charAt(i));
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            if (isGoodWord(word)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
