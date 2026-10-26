package DSA;

import java.util.*;

public class TwoPointersTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] height = new int[n];

        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        System.out.println(maxArea(height));
        scanner.close();
    }

    public static int maxArea(int[] height) {
        // Write your code here
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int width = right - left;
            int limit = Math.min(height[left], height[right]);
            int area = width * limit;

            max = Math.max(max, area);

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
