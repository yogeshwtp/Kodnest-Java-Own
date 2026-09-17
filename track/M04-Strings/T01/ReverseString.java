package T01;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");

        String str = sc.next();
        char a[] = str.toCharArray();
        char newa[] = new char[a.length];
        int j = newa.length - 1;

        for (int i = 0; i < a.length; i++) {
            newa[j] = a[i];
            j--;
        }

        String revStr = new String(newa);
        System.out.println("Original String is " + str);
        System.out.println("Reversed String is: " + revStr);
    }
}