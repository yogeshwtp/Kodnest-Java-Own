import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int a[] = new int[size];

        for (int i = 0; i <= size - 1; i++) {
            a[i] = scan.nextInt();
        }

        int key = scan.nextInt();

        int count = 0;

        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] == key) {
                count++;
            }
        }

        System.out.print("Frequency of " + key + ": " + count);
        scan.close();
    }
}
