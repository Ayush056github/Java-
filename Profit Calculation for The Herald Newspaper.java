// 

import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a =  sc.nextInt();     
    int b = sc.nextInt();       
    int c = sc.nextInt();      
    

    int TotalRevenue = a*b;
    int TotalCost = (a*c) + 100;
    int Profit = TotalRevenue - TotalCost;
    System.out.println(Profit);


    sc.close();
  }
}
