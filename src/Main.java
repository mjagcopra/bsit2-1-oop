public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Mike", 20, "Math", 85.5, 78.0, 92.0);
        Student student2 = new Student("Derek", 22, "English", 65.0, 70.0, 60.0);
        Student student3 = new Student("Kael", 19, "AP", 55.0, 58.5, 61.0);


        System.out.println("student1");
        System.out.println("student1.name");
        System.out.println("student1.course");
        System.out.println("student1.age");

        System.out.println("student2");
        System.out.println("student2.name");
        System.out.println("student2.course");
        System.out.println("student2.age");

        System.out.println("student3");
        System.out.println("student3.name");
        System.out.println("student3.course");
        System.out.println("student3.age");
        }


        System.out.println("Total number of students passing: " + passingCount);
    }
}