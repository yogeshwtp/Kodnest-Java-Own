package DSA;
import java.util.*;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        System.out.printf("%.5f", findMaxAverage(nums, k));
        scanner.close();
    }

    public static double findMaxAverage(int[] nums, int k) {
        // Write your code here...
        int windowSum = 0;

        for(int i=0; i<k; i++){
            windowSum += nums[i];
        }

        
        int max = windowSum;

        for(int i=k; i<nums.length; i++){
            windowSum += nums[i] - nums[i-k];
            if(windowSum > max){
                max = windowSum;
            }
        }
        return (double)max / k;
    }
}
