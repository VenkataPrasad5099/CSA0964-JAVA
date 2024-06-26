import java.util.Locale;

class Plin {
    public static void main(String[] args) {
        String str = "thejas";
        str = str.toLowerCase(Locale.ROOT);
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                System.out.println("it is not a palindrome");
                break;

            } else {
                System.out.println("palindrome");
            }
        }
    }
}