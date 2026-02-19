// 
import java.util.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  Striing t =  sc.nextLine();
  String[] parts = t.split(":");

  int h = Integer.parseInt(t.substring(0,2))%12;
   int m = Integer.parseInt(t.substring(3));

  double angle = Math.abs( 30*h + 0.5*m) - (6*m);
  System.out.println("%.1f" , Math.min(angle,360-angle);
}
}



  
  
  
