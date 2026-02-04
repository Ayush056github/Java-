// 
import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n<=0){
            System.out.println("It's not a power of  four");
            
        }
        while(n%4==0){
            n = n/4;
            
        }
        
        if(n==1){
            System.out.println("Yes, It's is a Power of four");
        }else{
            System.out.println("No,it's not is a power of four ");
        }
    }
}

//
