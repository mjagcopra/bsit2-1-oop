import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Section: ");
        String section = scanner.nextLine();

        System.out.println("STUDENT SCORE");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        System.out.print("Enter Midterm Exam Score (out of 100): ");
        int midtermScore = scanner.nextInt();

        System.out.print("Enter Final Exam Score (out of 100): ");
        int finalScore = scanner.nextInt();

        System.out.print("Enter Project Score (out of 100): ");
        int projectScore = scanner.nextInt();

        System.out.print("Enter Attendance Percentage (out of 100): ");
        int attendanceScore = scanner.nextInt();

        int totalScore = midtermScore + finalScore + projectScore + attendanceScore;
        double averageScore = (double) totalScore / 400 * 100; // Percentage

        String remarks = (averageScore < 75) ? "FAILED" : "PASSED";

        System.out.println("STUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midtermScore);
        System.out.println("Final Exam Score: " + finalScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Attendance Score: " + attendanceScore);
        System.out.println("Average Score: " + averageScore + "%");
        System.out.println("Remarks: " + remarks);

        scanner.close();
    }
}