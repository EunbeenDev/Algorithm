import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int n= Integer.parseInt(br.readLine());
		Deque<Integer> deque= new ArrayDeque<>();
		StringBuilder sb= new StringBuilder();
		
		for(int i=0;i<n;i++) {
			String s= br.readLine();
			if(s.length()>1) {
				//명령 1 || 2
				StringTokenizer st= new StringTokenizer(s);
				int order= Integer.parseInt(st.nextToken());
				int su= Integer.parseInt(st.nextToken());
				
				if(order==1) {
					deque.offerFirst(su);
				}else if(order==2) {
					deque.offerLast(su);
				}
			}else {
				int order= Integer.parseInt(s);
				if(order==3) {
					if(deque.isEmpty()) 
						sb.append("-1\n");
					else
						sb.append(deque.pollFirst()+"\n");
				}else if(order==4) {
					if(deque.isEmpty()) 
						sb.append("-1\n");
					else
						sb.append(deque.pollLast()+"\n");
				}else if(order==5) {
					sb.append(deque.size()+"\n");
				}else if(order==6) {
					if(deque.isEmpty()) 
						sb.append("1\n");
					else 
						sb.append("0\n");
				}else if(order==7) {
					if(deque.isEmpty()) 
						sb.append("-1\n");
					else
						sb.append(deque.peekFirst()+"\n");
				}else if(order==8) {
					if(deque.isEmpty()) 
						sb.append("-1\n");
					else
						sb.append(deque.peekLast()+"\n");
				}
			}
		}
		System.out.println(sb.toString());
	}

}