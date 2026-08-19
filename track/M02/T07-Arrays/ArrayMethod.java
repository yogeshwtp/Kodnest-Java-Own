import java.util.Scanner;
class ScoreEditor {
    void correctScore(int[] scores, int index, int newScore) {
        // Validate the index and update the score
        if (index >= 0 && index <= scores.length - 1) {
            scores[index] = newScore;
        } else {
            System.out.println("Invalid index");
        }
    }

    void displayScores(int[] scores) {
        // Print all scores
        System.out.print("Scores: ");

        for (int i = 0; i <= scores.length - 1; i++) {
            System.out.print(scores[i] + " ");
        }
    }
}
public class ArrayMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] scores = new int[size];

        for (int index = 0; index < scores.length; index++) {
            scores[index] = scanner.nextInt();
        }

        int correctionIndex = scanner.nextInt();
        int newScore = scanner.nextInt();

        // Create one ScoreEditor object
        ScoreEditor edit = new ScoreEditor();

        // Correct the score and display the array
        edit.correctScore(scores, correctionIndex, newScore);
        edit.displayScores(scores);

        scanner.close();
    }
}
