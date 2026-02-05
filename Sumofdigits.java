// 
// sum of number digits 

import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        
        while(n!=0){
            int digits = n%10;
            sum = sum+digits;
            n/=10;
            
        }
        System.out.println("The sum of digits is :"+sum);
    }
}
