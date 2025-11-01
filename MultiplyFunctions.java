import java.util.*;

public class MultiplyFunctions {
    public static  int ProductCalculate(int a , int b){
         return  a*b;
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int multiply = ProductCalculate(a,b);
        System.out.println("The multiplication is: " + multiply);
        sc.close();
    }
    
}
