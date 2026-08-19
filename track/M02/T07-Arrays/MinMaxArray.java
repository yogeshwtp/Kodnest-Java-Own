import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int a[] = new int[size];

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }

        int max = a[0];
        int min = a[0];

        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        scan.close();
    }
}
