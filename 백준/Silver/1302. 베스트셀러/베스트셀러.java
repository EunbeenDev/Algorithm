
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> bookList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            bookList.add(sc.next());
        }

        Collections.sort(bookList);
        String mBook = bookList.get(0);
        int mCnt = Collections.frequency(bookList, mBook);

        for (String book : bookList) {
            int count = Collections.frequency(bookList, book);
            if (count > mCnt) {
                mBook = book;
                mCnt = count;
            }
        }
        System.out.println(mBook);
    }
}
