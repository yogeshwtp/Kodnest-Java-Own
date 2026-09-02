import java.util.Scanner;

public class CheckIfArraySorted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int sorted = 1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = 0;
                break;
            }
        }

        System.out.println(sorted);
        scan.close();
    }
}
