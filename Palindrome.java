//

public class Palindrome {
    public static void main(String[] args) {
        String str = "Bharat";
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
