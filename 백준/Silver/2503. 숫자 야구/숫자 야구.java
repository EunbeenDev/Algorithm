import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int N;
    public static int[][] a;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int result = 0;

        N = Integer.parseInt(br.readLine());
        a = new int[N][3];

        for (int i = 0; i < N; i++) {
            input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            
            a[i][0] = Integer.parseInt(st.nextToken()); 
            a[i][1] = Integer.parseInt(st.nextToken()); 
            a[i][2] = Integer.parseInt(st.nextToken()); 
            
        }

        for (int i = 1; i <= 9; i++)
            for (int j = 1; j <= 9; j++)
                for (int k = 1; k <= 9; k++)
                    if (i != j && j != k && i != k)
                        if (solution(i, j, k)) {result++;}
        System.out.println(result);
    }

    public static boolean solution(int n1, int n2, int n3) {
        int first, second, third;
        int strike, ball;
        for (int i = 0; i < N; i++) {
            strike = 0;
            ball = 0;
            first = a[i][0] / 100; // 백의 자리
            second = (a[i][0] % 100) / 10; // 십의 자리
            third = a[i][0] % 10; // 일의 자리
            
            if (first == n1)
                strike++;
            else if (first == n2 || first == n3)
                ball++;
            if (second == n2)
                strike++;
            else if (second == n1 || second == n3)
                ball++;
            if (third == n3)
                strike++;
            else if (third == n2 || third == n1)
                ball++;

            if (strike != a[i][1] || ball != a[i][2])
                return false;
        }
        return true;
    }
}