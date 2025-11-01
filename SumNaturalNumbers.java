import java.util.*;
public class SumNaturalNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number : ");
        int num = sc.nextInt();
        int sum = num*(num+1)/2;
        System.out.println("Sum natural numbers is: " + sum);

    }
}
