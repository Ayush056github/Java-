public class GCDemo {
    // Recursive method for GCD
    public static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        } else {
            return gcd(n2, n1 % n2);
        }
    }

    public static void main(String[] args) {
        int n1 = 366, n2 = 60;
        System.out.printf("G.C.D of %d and %d is %d.", n1, n2, gcd(n1, n2));
    }
}
