import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(String.valueOf(sc.nextLine()));

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cnt = 0;
            Queue<int[]> q = new LinkedList<>();
            for (int j = 0; j < a; j++) {
                q.add(new int[]{j, sc.nextInt()});
            }

            while (true) {
                int[] present = q.remove();
                boolean tf = true;

                for (int[] queue : q) {
                    if (queue[1] > present[1]) {
                        tf = false;
                        break;
                    }
                }

                if (tf) {
                    cnt++;
                    if (present[0] == b){break;}
                } else {q.add(present);}
            }
            System.out.println(cnt);
        }
    }
}
