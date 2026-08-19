    import java.util.Scanner;

public class SearchAndReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int a[] = new int[size];

        for (int i = 0; i <= size - 1; i++) {
            a[i] = scan.nextInt();
        }

        int key = scan.nextInt();
        boolean found = false;

        for (int i = 0; i <= size - 1; i++) {
            if (a[i] == key) {
                System.out.println("Found");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }

        System.out.print("Reverse order: ");

        for (int i = size - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");


        }
        scan.close();
    }
}
