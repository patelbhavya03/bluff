class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

class Test extends Student {
    int marks1, marks2;

    public Test(int rollNo, String name, int marks1, int marks2) {
        super(rollNo, name);
        this.marks1 = marks1;
        this.marks2 = marks2;
    }
}

class Result extends Test {
    int total;

    public Result(int rollNo, String name, int marks1, int marks2) {
        super(rollNo, name, marks1, marks2);
    }

    public void calculate() {
        total = marks1 + marks2;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
        System.out.println("Total: " + total);
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Result result = new Result(66 ,"Bhavya Patel", 85, 90 );
        result.calculate();
        result.display();
    }
}
