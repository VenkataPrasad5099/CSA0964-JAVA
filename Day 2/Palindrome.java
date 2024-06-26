public class Palindrome {
    public static void main(String[] args) {
    String str="madam";

        for (int i = 0; i <= str.length()/2 ; i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length() - 1 );

            if (start != end) {
                System.out.println("not a palindrome");
                break;
            } else {
                System.out.println("it is palindrome");
                break;
            }
        }

    }
}
