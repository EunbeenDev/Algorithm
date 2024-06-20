import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int first = Integer.parseInt(st.nextToken());
 
		for (int i = 1; i < N; i++) {
			int other = Integer.parseInt(st.nextToken());
			int gcd = gcd(first, other);
 
			System.out.println((first / gcd) + "/" + (other / gcd));
		}
	}
 
	// 최대공약수 메소드
	static int gcd(int a, int b) {
		int r;
		while (b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}