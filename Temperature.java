// 
import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temperature:");
        double temp = sc.nextDouble();

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("Enter Your Choice:");
        int choice = sc.nextInt();

        if (choice == 1) {
            double fahrenheit = (temp * 1.8) + 32;
            System.out.println("Celsius to Fahrenheit: " + fahrenheit);
        } 
        else if (choice == 2) {
            double celsius = (temp - 32) / 1.8;
            System.out.println("Fahrenheit to Celsius: " + celsius);
        } 
        else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
// 
