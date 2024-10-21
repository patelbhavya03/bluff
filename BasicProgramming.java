public class BasicProgramming {
    public static void main(String[] args) {
        int number = 5;

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        switch (number) {
            case 1 -> System.out.println("Number is 1");
            case 5 -> System.out.println("Number is 5");
            default -> System.out.println("Number is neither 1 nor 5");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
        }
        System.out.println();

        int count = 5;
        while (count > 0) {
            System.out.print(count);
            count--;
        }
        System.out.println();

        int j = 1;
        do {
            System.out.print(j);
            j++;
        } while (j <= 3);
        System.out.println();
    }
}
