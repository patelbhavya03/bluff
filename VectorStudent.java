import java.util.Vector;
import java.util.Scanner;

public class VectorStudent {
    public static void main(String[] args) {
        Vector<String> students = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Student\n2. Remove Student\n3. Display Students\n4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    students.add(name);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    students.remove(removeName);
                    break;
                case 3:
                    System.out.println("Students: " + students);
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
