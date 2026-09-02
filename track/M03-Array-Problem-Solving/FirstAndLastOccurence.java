import java.util.Scanner;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        int target = scan.nextInt();
        int first = -1;
        int last = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        System.out.print(first + " " + last);
        scan.close();
    }
}
