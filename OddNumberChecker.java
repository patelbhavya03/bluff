class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddNumberChecker {
    public static void main(String[] args) {
        try {
            checkNumber(5);
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Number is odd");
        } else {
            System.out.println("Number is even");
        }
    }
}
