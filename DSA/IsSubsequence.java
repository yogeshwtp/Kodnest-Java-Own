package DSA;

import java.util.*;

public class IsSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(isSubsequence(s, t));
        scanner.close();
    }

    public static boolean isSubsequence(String s, String t) {
        // Write your code here...

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        if (s.length() == i) {
            return true;
        } else {
            return false;
        }
    }
}
