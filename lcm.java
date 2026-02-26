public class LCMBruteForce {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 15;
        int lcm;

      
        int max = (num1 > num2) ? num1 : num2;

      
        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                lcm = max;
                break; // Found the LCM, exit the loop
            }
            max++; 
        }
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm); 
    }
}
