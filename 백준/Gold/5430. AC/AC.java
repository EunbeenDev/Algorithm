//Gold_AC
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            String commands = sc.nextLine();
            int n = Integer.parseInt(sc.nextLine());
            String input = sc.nextLine();

            Deque<Integer> deque = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(input.substring(1, input.length() - 1), ",");
            while (st.hasMoreTokens()) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            boolean reversed = false;
            boolean error = false;

            for (char command : commands.toCharArray()) {
                if (command == 'R') {
                    reversed = !reversed;
                } else if (command == 'D') {
                    if (deque.isEmpty()) {
                        error = true;
                        break;
                    }
                    if (reversed) {
                        deque.pollLast();
                    } else {
                        deque.pollFirst();
                    }
                }
            }

            if (error) {
                System.out.println("error");
            } else {
                StringBuilder result = new StringBuilder("[");
                if (!reversed) {
                    while (!deque.isEmpty()) {
                        result.append(deque.pollFirst());
                        if (!deque.isEmpty()) {
                            result.append(",");
                        }
                    }
                } else {
                    while (!deque.isEmpty()) {
                        result.append(deque.pollLast());
                        if (!deque.isEmpty()) {
                            result.append(",");
                        }
                    }
                }
                result.append("]");
                System.out.println(result);
            }
        }
    }
}
