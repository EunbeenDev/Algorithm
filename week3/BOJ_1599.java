package week3;
//Gold_민식어
import java.util.*;

public class BOJ_1599 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        List<String> words = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String word = sc.nextLine();
            words.add(word);
        }

        // 정렬 기준에 따라 비교 함수를 사용하여 정렬
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 문자열 비교 함수
                return compareStrings(s1, s2);
            }
        });

        // 정렬된 결과 출력
        for (String word : words) {
            // 정렬된 문자열을 원래대로 복구
            System.out.println(restoreString(word));
        }
    }

    // 문자열 비교 함수
    static int compareStrings(String s1, String s2) {
        // 문자 'k'를 'c'로 변경, "ng"를 "N"으로 변경
        s1 = s1.replace("k", "c").replace("ng", "N");
        s2 = s2.replace("k", "c").replace("ng", "N");

        return s1.compareTo(s2); // 문자열을 사전 순으로 비교
    }

    // 정렬된 문자열을 원래대로 복구
    static String restoreString(String s) {
        // "c"를 "k"로, "N"을 "ng"으로 복구
        return s.replace("c", "k").replace("N", "ng");
    }
}
