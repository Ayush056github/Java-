// 
import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        int power = 1;
        
        while(power*2<=n){
            power = power * 2;
            
        }
    
    System.out.println(power);
    }
}
