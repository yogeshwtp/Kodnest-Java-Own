package DSA;

import java.util.Scanner;
import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] routeOne = new int[n];

        for (int i = 0; i < n; i++) {
            routeOne[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] routeTwo = new int[m];

        for (int i = 0; i < m; i++) {
            routeTwo[i] = scanner.nextInt();
        }

        // Find common unique stops.

        HashSet<Integer> setOne = new HashSet<>();
        HashSet<Integer> setTwo = new HashSet<>();

        for (int i = 0; i < n; i++) {
            setOne.add(routeOne[i]);
        }

        for (int i = 0; i < m; i++) {
            if (setOne.contains(routeTwo[i])) {
                setTwo.add(routeTwo[i]);
            }
        }
        System.out.println("Common stops: " + setTwo.size());

        scanner.close();
    }
}