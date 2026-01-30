// 
// 
import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int r = 0 ;
        int sum =0;
        
        while(n>0){
            
            r = n%10;
            n=n/10;
            sum = sum + r*r*r;
            
        }
         if(temp==sum){
             System.out.println("Yes , its is an armstrong number:");
         } else {
             System.out.println("No, its is not an armstrong number:");
             
         }
    }

  // 
}
