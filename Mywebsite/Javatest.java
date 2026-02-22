// Part A: Student Class
class Student {
    String name;
    int id;
    double marks;

    public Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("ID: " + id + " | Name: " + name + " | Marks: " + marks);
    }

    // Method to check if the student passed
    public boolean isPass() {
        return marks >= 50;
    }
}

// Part B: Main Class
public class Main {
    public static void main(String[] args) {
        // Creating an array to hold 3 Student
        Student[] students = new Student[3];

        // Assigning values to each student
        students[0] = new Student("Alice Johnson", 101, 85.5);
        students[1] = new Student("Bob Smith", 102, 42.0);
        students[2] = new Student("Charlie Davis", 103, 67.0);

        int passCount = 0;

        System.out.println("--- Student Records ---");
        
        // Displaying details and counting passes
        for (Student s : students) {
            s.displayDetails();
            if (s.isPass()) {
                passCount++;
            }
        }

        System.out.println("-----------------------");
        System.out.println("Total Students Passed: " + passCount);
    }
}