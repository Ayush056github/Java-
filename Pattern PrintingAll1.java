// 
import java.util.*;
import java.util.Scanner;

public class Main{
  public static void  main(String[] args){

  for(int = i  = 0;i<4;i++){
    for(int j = 0 ; j<4;j++){
      System.out.print("*");
    }
    System.out.println();
  }
  }
}
// 
Output -- 
****
****
****
****

// 
import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i =0;i<n;i++){
            for(int j =0 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// 
Output --  
*
**
***
****

// 
import java.util.*;


public class Main{
    public static void main(String[] args){
       
        for(int i = 1;i<7;i++){
            for(int j =1 ;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// 
  1
  12
  123
  1234
  12345
  123456
  
