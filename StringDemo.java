import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        // Demonstrating String methods
        String str = "Hello";
        System.out.println("Original String: " + str);
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Length of the string: " + str.length());
        System.out.println("First character: " + str.charAt(0));
        System.out.println("Replaced 'e' with 'a': " + str.replace('e', 'a'));

        // Demonstrating StringBuffer methods
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("\nOriginal StringBuffer: " + sb);
        sb.append(" World");
        System.out.println("After appending: " + sb);
        sb.reverse();
        System.out.println("After reversing: " + sb);

        // Checking if a string is a palindrome
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        String reversed = new StringBuffer(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
    }
}
