// 
import java.util.*;
import java.util.Scanner;

public class VedioShare{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int userpoint = sc.nextInt();

    if(userpoint < 30 || userpoint > 100){
      System.out.println("Invalid Result ");
      
    }else if(userpoint >= 30 && userpoint <= 50){
      System.out.println("Average");
    }else if(userpoint >= 51 && userpoint <= 60){
      System.out.println("Good");
    }else if(userpoint >= 61 && userpoint <= 80){
      System.out.println("Excellent");
    }else{
      System.out.println("Outstanding");
    }
  }
}

// 
