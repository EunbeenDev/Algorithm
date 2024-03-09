import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.next(), s2=sc.next();
		long result=0;

		for(int i=0;i<s1.length();i++)
			for(int j=0;j<s2.length();j++)
				result+=(s1.charAt(i)-'0')*(s2.charAt(j)-'0');

		System.out.println(result);

	}

}