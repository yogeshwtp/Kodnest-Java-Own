package DSA;

import java.util.*;

public class BinarySearchCeiling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] piles = new int[n];
        for (int i = 0; i < n; i++) {
            piles[i] = scanner.nextInt();
        }
        int h = scanner.nextInt();
        int result = minEatingSpeed(piles, h);
        System.out.println(result);
        scanner.close();
    }

    public static int minEatingSpeed(int[] piles, int h) {
        // Write your code here
        int max = 0;
        for (int i = 0; i <= piles.length - 1; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }

        int left = 1;
        int right = max;
        int ans = 0;
        int neededHours = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            for (int i = 0; i < piles.length; i++) {
                neededHours += (piles[i] + mid - 1) / 2;
            }
            if (neededHours <= h) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}