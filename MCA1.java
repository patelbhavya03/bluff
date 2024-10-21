package MCA;

public class Student {
    private String name;
    private int rollNumber;
    private int marks1, marks2, marks3;

    public Student(String name, int rollNumber, int marks1, int marks2, int marks3) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
    }

    public int getTotalMarks() {
        return marks1 + marks2 + marks3;
    }

    public float getPercentage() {
        return getTotalMarks() / 3.0f;
    }
}
