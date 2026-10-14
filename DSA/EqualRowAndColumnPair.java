package DSA;

import java.util.*;

public class EqualRowAndColumnPair {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int arr[][] = new int[n][n];

        // Read the matrix values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        // Count each row as a string
        Map<String, Integer> freq = new HashMap<>();
        for (int a[] : arr) {
            String eachRow = Arrays.toString(a);
            freq.put(eachRow, freq.getOrDefault(eachRow, 0) + 1);
        }

        int count = 0;

        // Build each column and look it up in the map
        for (int c = 0; c < n; c++) {
            int currentColumn[] = new int[n];
            for (int r = 0; r < n; r++) {
                currentColumn[r] = arr[r][c];
            }
            String cc = Arrays.toString(currentColumn);
            count += freq.getOrDefault(cc, 0);
        }

        System.out.println(count);
        scan.close();
    }
}