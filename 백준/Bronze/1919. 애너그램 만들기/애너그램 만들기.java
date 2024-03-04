import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String w1=sc.nextLine();
        String w2=sc.nextLine();

        ArrayList<String> arr1=new ArrayList<>();
        ArrayList<String> arr2=new ArrayList<>();

        for(int i=0; i<w1.length(); i++){
            arr1.add(Character.toString(w1.charAt(i)));
        }
        for(int i=0; i<w2.length();i++){
            String s=Character.toString(w2.charAt(i));
            arr2.add(s);
            if(arr1.contains(s)){arr1.remove(s); arr2.remove(s);}
        }
        System.out.print(arr1.size()+arr2.size());
    }

}