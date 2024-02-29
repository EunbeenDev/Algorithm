import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();
        long init_Z = (Y * 100) / X;
        long new_Z;
        long index = 0;

        if (init_Z >= 99) { System.out.println(-1); } 
        else {
            long left = 0;
            long right = X;

            while (left < right) {
                index = (left + right) / 2;
                new_Z = ((Y + index) * 100) / (X + index);

                if (new_Z > init_Z) {
                    right = index;
                } else {
                    left = index + 1;
                }
            }
            System.out.println(left);
        }
    }
}
