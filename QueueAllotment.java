// 
///Queue Allotment 
import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    
    int first = sc.nextInt();
    int second =  sc.nextInt();
    int third = sc.nextInt();
    int n = sc.nextInt();
    
    if(first>10||second>10||third>10||first <0 || second <0|| third <0){
        System.out.println("Invalid Input");
        return ;
        
    }
    
    int add1 =  Math.min(10-first,n);
    n-=add1;
    int add2 =  Math.min(10-second,n);
    n-=add2;
    int add3 =  Math.min(10-third,n);
    n-=add3;
    
    int wait = n ;
    
    System.out.println(add1);
     System.out.println(add2);
      System.out.println(add3);
      System.out.println(wait);
    
    
    
    
    
    
}
}
// 
