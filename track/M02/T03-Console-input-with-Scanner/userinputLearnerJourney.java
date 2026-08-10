import java.util.Scanner;
public class userinputLearnerJourney {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the learner details
        // Calculate and display the progress summary
        String fullName = scanner.nextLine();
        System.out.println("Learner: " + fullName);

        int practiceDays = scanner.nextInt();
        int totalProblemSolved = 0;

        for (int i = 1; i <= practiceDays; i++) {
            int solvedProblemsCount = scanner.nextInt();
            totalProblemSolved += solvedProblemsCount;
        }

        System.out.println("Total solved: " + totalProblemSolved);

        double average = totalProblemSolved / practiceDays;

        System.out.println("Daily average: " + average);

        if (average >= 5.0) {
            System.out.println("Status: Consistent");
        } else {
            System.out.println("Status: Needs consistency");
        }
        scanner.close();
    }
}
