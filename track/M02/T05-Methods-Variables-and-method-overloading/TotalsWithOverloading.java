import java.util.Scanner;

class ResultCalculator {
    int getTotal(int first, int second) {
        // Return the total of two marks
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        // Return the total of three marks
        return first + second + third;
    }
}

public class TotalsWithOverloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three marks
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        // Create one ResultCalculator object
        ResultCalculator c = new ResultCalculator();

        // Call both overloaded methods and print both totals
        System.out.println("Two-Mark Total: " + c.getTotal(first, second));
        System.out.println("Three-Mark Total: " + c.getTotal(first, second, third));

        scanner.close();
    }
}