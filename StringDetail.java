class StringDetail {
    private String str;
    private int upperCaseCount;
    private int vowelCount;

    public StringDetail(String str) {
        this.str = str;
        calculateDetails();
    }

    private void calculateDetails() {
        upperCaseCount = 0;
        vowelCount = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            }
            if (isVowel(ch)) {
                vowelCount++;
            }
        }
    }

    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public String getString() {
        return str;
    }

    public int getUpperCaseCount() {
        return upperCaseCount;
    }

    public int getVowelCount() {
        return vowelCount;
    }

    public static void main(String[] args) {
        StringDetail details = new StringDetail("Bhavya");
        System.out.println("String: " + details.getString());
        System.out.println("Upper-case Count: " + details.getUpperCaseCount());
        System.out.println("Vowel Count: " + details.getVowelCount());
    }
}
