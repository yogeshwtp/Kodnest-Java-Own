import java.util.Scanner;

class Person {
    private String name;

    Person(String name) {
        // Initialize name
        this.name = name;
    }

    public String getName() {
        // Return name
        return name;
    }
}

class Student extends Person {
    private int marks;

    Student(String name, int marks) {
        // Call the parent constructor
        super(name);
        // Initialize marks
        this.marks = marks;
    }

    public void display() {
        // Print name and marks
        System.out.println(getName() + " " + marks);
    }
}

public class ConstructorChainingGlobal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        String name = scanner.next();
        int mark = scanner.nextInt();
        // Create Student
        Student s1 = new Student(name, mark);
        // Display values
        s1.display();
        scanner.close();
    }
}
