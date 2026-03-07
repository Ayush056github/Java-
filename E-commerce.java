// 
import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       String str  = sc.nextLine();
       
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       
       for( char ch : str.toCharArray()){
           int val = (int) ch;
           
           if(val<min){
               min = val;
           }
             if(val>max){
               min = val;
           }
          
       }
        System.out.println(min+max);
    }
}
