import java.util.Scanner;

public class ArrayAndMatrixTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];

        int arrayTotal = 0;

        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
            arrayTotal += array[i];
        }

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        int matrixTotal = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
                matrixTotal += matrix[i][j];
            }
        }

        System.out.println("Array total: " + arrayTotal);
        System.out.println("Matrix total: " + matrixTotal);
        sc.close();
    }
}
