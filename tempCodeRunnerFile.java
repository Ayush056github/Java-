import java.util.*;
public class Exponents {
    public static int exponents(int  a , int b){
        int n = 1;
        for(int i = 0 ; i < b ; i++){
            n *= a;

        }
        return n;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of a:");
        int a  = sc.nextInt();
        System.out.println("Enter a value of b:");
        int b = sc.nextInt();
        int result =  exponents(a,b);
        System.out.println(result);

        
        
    }
    
}
