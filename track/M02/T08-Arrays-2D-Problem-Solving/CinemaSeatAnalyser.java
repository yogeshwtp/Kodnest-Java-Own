import java.util.Scanner;

public class CinemaSeatAnalyser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] seats = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                seats[row][column] = scanner.nextInt();
            }
        }

        int availableSeats = 0;

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (seats[row][column] == 0) {
                    availableSeats++;
                }
            }
        }

        System.out.println("Available seats: " + availableSeats);

        scanner.close();
    }
}
