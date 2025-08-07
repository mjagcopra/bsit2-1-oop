public class Student {
    String name = "";
    int age = 0;
    String course = "";
    double grade1 = 0;
    double grade2 = 0;
    double grade3 = 0;

    public Student(String studentName, int ageOfStudent, String courseOfStudent, double Grade1, double Grade2, double Grade3) {
        name = studentName;
        age = ageOfStudent;
        course = courseOfStudent;
        grade1 = Grade1;
        grade2 = Grade2;
        grade3 = Grade3;
    }

    public void displayInfo() {
        System.out.print("Name: " + name);
        System.out.print(" ");
        System.out.print("Age: " + age);
        System.out.print(" ");
        System.out.println("Course: " + course);
        System.out.println("Grades: " + grade1 + "," + grade2 + "," + grade3);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Letter Grade: " + getLetterGrade());
        System.out.println("Status: " + isPassing());

    }

    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }

    public String getLetterGrade() {
        double average = calculateAverage();
        if (average >= 90) {
            return "A";
        } else if (average <= 89) {
            return "B";
        } else if (average <= 79) {
            return "C";
        } else if (average <= 69) {
            return "D";
        } else {
            return "F";
        }
    }

    public String isPassing() {
        if (calculateAverage() >= 70) {
            return "PASS";
        } else {
            return "FAILED";
        }
    }
}