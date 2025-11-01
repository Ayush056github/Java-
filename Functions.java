import java.util.*;

public class Functions{
    public static int sumcalculate(int a , int b){
        int  sum =  a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int sum = sumcalculate(a,b);
        System.out.println("The sum is: " + sum);
        sc.close();
    

    }
}