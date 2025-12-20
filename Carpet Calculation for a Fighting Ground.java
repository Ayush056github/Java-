// 

import java.util.Scanner;

public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int Length = sc.nextInt();
    int Breadth = sc.nextInt();

    int perimeter = 2*(Length+Breadth);
    int Area = Length*Breadth;

    System.out.println("The required length is "+perimeter+" m");
    System.out.println("The required area of carpet is "+Area+" sqm");

    sc.close();
    
    
  }
}
