//

import java.util.Scanner;

public class Fahrenheit {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.println("---Temperature Converter---");
    System.out.println("1.  Fahrenheit to Celsius " );
    System.out.println("2. Celsius to Fahrenheit " );
    System.out.println(" Exit " );
    int choice =  sc.nextInt();

    double temp , result ;
    if(choice == 1){
      System.out.print("Enter Temperature in Fahrenheit");
      temp = sc.nextDouble();
      result = (temp-32)*5/9;
      System.out.println("Temp in Celsius:"+result);
    }
    else if (choice == 2) {
      System.out.println("Enter temperature in Celsius:");
      temp = sc.nextDouble();
      result = (temp*5/9)+32;
      System.out.println("Temp in Fahrenheit:"+result);
    }
    else{
      System.out.println(" Invalid choice ! " ) ;
    }

    sc.close();
  }
}
      
    
  
