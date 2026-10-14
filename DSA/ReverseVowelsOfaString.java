package DSA;

import java.util.*;

public class ReverseVowelsOfaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(reverseVowels(s));
        scanner.close();
    }

    public static String reverseVowels(String s) {
        // Write your code here...
        char letters[] = s.toCharArray();
        int left = 0;
        int right = letters.length - 1;

        while (left < right) {
            if (!isVowel(letters[left])) {
                left++;
            } else if (!isVowel(letters[right])) {
                right--;
            } else {

                char temp = letters[left];
                letters[left] = letters[right];
                letters[right] = temp;
                left++;
                right--;
            }
        }
        return new String(letters);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
