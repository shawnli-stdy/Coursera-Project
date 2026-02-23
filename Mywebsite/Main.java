import java.util.Scanner;

class Student {
    String name;
    int id;
    double marks;

    public Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + " | Name: " + name + " | Marks: " + marks);
    }

    public boolean isPass() {
        return marks >= 50;
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int numStudents = input.nextInt();
            // Initialize the array based on user choice
            Student[] students = new Student[numStudents];
            // Input loop
            for (int i = 0; i < students.length; i++) {
                System.out.println("\nEntering details for Student " + (i + 1) + ":");
                
                input.nextLine(); // Consume the leftover newline character
                System.out.print("Enter Name: ");
                String name = input.nextLine();
                
                System.out.print("Enter ID: ");
                int id = input.nextInt();
                
                System.out.print("Enter Marks: ");
                double marks = input.nextDouble();
                
                // Create the object and store it in the array
                students[i] = new Student(name, id, marks);
            }   // Display and Count Logic
            int passCount = 0;
            System.out.println("\n--- Student Records ---");
            for (Student s : students) {
                s.displayDetails();
                if (s.isPass()) {
                    passCount++;
                }
            }   System.out.println("-----------------------");
            System.out.println("Total Students Passed: " + passCount);
            // Good practice to close the scanner
        }
    }
}
