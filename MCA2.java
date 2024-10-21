import MCA.Student;

public class MainClass {
    public static void main(String[] args) {
        Student student = new Student("Alice", 101, 85, 90, 88);
        student.display();

        int totalMarks = student.getTotalMarks();
        float percentage = student.getPercentage();

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
