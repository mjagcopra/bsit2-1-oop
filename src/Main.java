public class Main {

    public double calculateAverage(double... grades) {
        if (grades.length == 0) {
            return 0.0; // Return 0.0 if no grades are provided
        }

        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length; // Return the average
    }


    public String getLetterGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }


    public void displayResult(String studentName, double average) {
        System.out.printf("Student: %s, Average: %.2f%n", studentName, average);
    }


    public void displayResult(String studentName, double average, String letterGrade) {
        System.out.printf("Student: %s, Average: %.2f, Letter Grade: %s%n", studentName, average, letterGrade);
    }


    public static void main(String[] args) {
        Main calculator = new Main();


        String studentName = "John Smith";
        double[] grades = {85.5, 92.0, 78.5, 90.0};


        double average = calculator.calculateAverage(grades);


        String letterGrade = calculator.getLetterGrade(average);


        calculator.displayResult(studentName, average);
        calculator.displayResult(studentName, average, letterGrade);
    }
}
