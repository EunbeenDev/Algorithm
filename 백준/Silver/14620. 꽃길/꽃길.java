import java.io.*;
import java.util.*;

public class Main {
	
	static int[][]matrix;
	static int N;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		matrix = new int[N][N];
		int answer = Integer.MAX_VALUE;
		
		for (int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j=0; j<N; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		

		for (int i=0; i<(N*N); i++) {
			for (int j=0; j<(N*N); j++) {
				for (int k=0; k<(N*N); k++) {
					ArrayList<Integer> list = new ArrayList<>();
					list.add(i);
					list.add(j);
					list.add(k);
					answer = Math.min(answer, findCost(list));
				}	
			}
		}
		
		System.out.println(answer);
	}
	static int findCost(ArrayList<Integer> list) {
		int[] dx = {0, -1, 1, 0, 0};
		int[] dy = {0, 0, 0, -1, 1};	
		boolean[][] check = new boolean[N][N];
		
		int result = 0;
		for (int i: list) {
			int x = i / N;
			int y = i % N;
			
			// 가장 자리에 위치하면 불가
			if (x==0 || x==(N-1) || y==0 || y==(N-1)) {
				return 10000;
			}
			
			for (int j=0; j<5; j++) {
				if (!check[x+dx[j]][y+dy[j]]) {
					check[x+dx[j]][y+dy[j]] = true;
					result += matrix[x+dx[j]][y+dy[j]];
				}
				else return 10000;				
			}
		}
		return result;
	}
}