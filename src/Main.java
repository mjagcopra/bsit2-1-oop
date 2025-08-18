public class Main {
    public static void main(String[] args) {
        GradeCalculator gc = new GradeCalculator();
        double average = gc.calculateAverage(85.5, 92.0, 78.5, 90.0);
        String letterGrade = gc.getLetterGrade(average);

        gc.displayResult("John Smith", average);
        System.out.println("---------------------------");
        gc.displayResult("John Smith", average, letterGrade);
    }
}