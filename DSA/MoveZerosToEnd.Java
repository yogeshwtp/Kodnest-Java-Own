import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        scanner.close();
    }

    public static void moveZeroes(int[] nums) {
        // Write your code here...
        int write = 0;
        for(int read =0; read <nums.length; read++){
            if(nums[read] != 0){
                nums[write] = nums[read];
                write++;
            }
        }

        while(write < nums.length){
            nums[write] = 0;
            write++;
        }
    }
}
