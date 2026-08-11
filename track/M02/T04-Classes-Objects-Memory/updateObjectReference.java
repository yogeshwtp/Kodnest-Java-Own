import java.util.Scanner;

class Student {
    int registrationId;
    String name;
    double attendancePercentage;
}

public class updateObjectReference {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create and populate first student
        Student s1 = new Student();

        s1.registrationId = scanner.nextInt();
        scanner.nextLine();
        s1.name = scanner.next();
        s1.attendancePercentage = scanner.nextDouble();

        // Create and populate second student
        Student s2 = new Student();

        s2.registrationId = scanner.nextInt();
        scanner.nextLine();
        s2.name = scanner.next();
        s2.attendancePercentage = scanner.nextDouble();

        // Read selected ID and new attendance
        int selectedStudentId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        // Reference to the selected existing object
        Student selectedStudent = null;

        // Find the matching object
        if (selectedStudentId == s1.registrationId) {

            selectedStudent = s1;
            System.out.println("Selected Student: " + selectedStudent.name);

        } else if (selectedStudentId == s2.registrationId) {

            selectedStudent = s2;
            System.out.println("Selected Student: " + selectedStudent.name);

        } else {

            System.out.println("Student not found.");
        }

        // Update only if a student was found
        if (selectedStudent != null) {
            selectedStudent.attendancePercentage = newAttendance;
        }

        // Display both records
        System.out.println(
                s1.registrationId + " - " + s1.name + " - "
                        + s1.attendancePercentage + "%"
        );

        System.out.println(
                s2.registrationId + " - " + s2.name + " - "
                        + s2.attendancePercentage + "%"
        );

        scanner.close();
    }
}