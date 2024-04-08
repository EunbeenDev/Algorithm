import java.util.*;
public class Main {

    public static int binary_search(int[] arr, int t) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (t < arr[mid]) {high = mid - 1;} 
            else if (t > arr[mid]) {low = mid + 1;} 
            else {return mid;}
        }
        return -1; // 예외 처리
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {arr[i] = sc.nextInt();}

        Arrays.sort(arr);

        int m = sc.nextInt();
        for (int j = 0; j < m; j++) {
            if (binary_search(arr, sc.nextInt()) >= 0) {sb.append(1 + "\n");} 
            else {sb.append(0 + "\n");}
        }
        System.out.print(sb);
    }
}
