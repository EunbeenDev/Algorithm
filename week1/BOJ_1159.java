// Bronze_농구 경기
package week1;

import java.util.*;

public class BOJ_1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            names.add(line.substring(0, 1)); //첫 글자만 add
        }

        HashMap<String, Integer> freq = new HashMap<>();
        for (String name : names) {
            freq.put(name, freq.getOrDefault(name, 0) + 1);
        }

        ArrayList<String> result = new ArrayList<>();
        for (String name : freq.keySet()) {
            if (freq.get(name) >= 5) {
                result.add(name);
            }
        }

        Collections.sort(result); //정렬

        if(result.isEmpty()){System.out.print("PREDAJA");}
        else{
            for (String name : result) {
                System.out.print(name);
            }
        }

    }
}
