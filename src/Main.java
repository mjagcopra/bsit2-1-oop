public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Mike", 20, "Math", 85.5, 78.0, 92.0);
        Student student2 = new Student("Derek", 22, "English", 65.0, 70.0, 60.0);
        Student student3 = new Student("Kael", 19, "AP", 55.0, 58.5, 61.0);


        Student[] students = {student1, student2, student3};

        int passingCount = 0;


        for (Student s : students) {
            s.displayInfo();
            double avg = s.calculateAverage();
            String letter = s.getLetterGrade();
            boolean passing = s.isPassing();

            System.out.printf("Average Grade: %.2f\n", avg);
            System.out.println("Letter Grade: " + letter);
            System.out.println("Status: " + (passing ? "PASSING" : "FAILING"));
            System.out.println("");

            if (passing) passingCount++;
        }


        System.out.println("Total number of students passing: " + passingCount);
    }
}