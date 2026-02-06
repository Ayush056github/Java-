// 
import java.util.*;
import java.util.Scanner;

public class Main{
  public static  void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

  if(N<1){
    System.out.print("false");
    return;
  }
    while(N%4==0){
      N/=4;
    }
    if(N==1){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}
// 
      
