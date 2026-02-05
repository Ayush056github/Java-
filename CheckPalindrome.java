// 
//  Check its is the Palindrome--

import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int original = n ;
        
        int reverse = 0;
        
        while(n!=0){
            int digits = n % 10;
            
             reverse = reverse*10+digits;
            
            n/=10;
        }
        
        if(original == reverse){
            System.out.println("Yes , its is the Palindrome");
        }else{
            System.out.println("No , its is the Palindrome");
        }
        
    }

  // 
}
