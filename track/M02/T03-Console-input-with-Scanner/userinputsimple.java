import java.util.Scanner;

public class userinputsimple {
    public static void main(String[] args) {

        // Read and display the profile
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        int problemSolved = scan.nextInt();
        double percent = scan.nextDouble();

        System.out.println("Learner: " + firstName);
        System.out.println("Problems solved: " + problemSolved);
        System.out.println("Assessment: " + percent);

        scan.close();
    }
}