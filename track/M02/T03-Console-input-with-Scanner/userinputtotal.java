import java.util.Scanner;

public class userinputtotal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int practiceDays = scanner.nextInt();
        int totalSolved = 0;

        for (int i = 1; i <= practiceDays; i++) {
            int problemsSolved = scanner.nextInt();
            totalSolved += problemsSolved;
        }

        System.out.println("Total solved: " + totalSolved);

        if (totalSolved >= 20) {
            System.out.println("Status: Strong progress");
        } else if (totalSolved >= 10 && totalSolved <= 19) {
            System.out.println("Status: Keep improving");
        } else {
            System.out.println("Status: Needs more practice");
        }

        scanner.close();
    }
}