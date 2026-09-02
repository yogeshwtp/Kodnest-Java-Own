import java.util.Scanner;

public class ValuesGreaterThanAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }

        double avg = (double) sum / n;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (avg > arr[i]) {
                count++;
            }
        }

        System.out.println(count);

        scan.close();
    }
}
