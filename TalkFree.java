// 
import java.util.*;
import java.util.Scanner;

public class Talkfree{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   int  n  = sc.nextInt();
   int  m = n;
   int  rev = 0;

    while(n!=0){
      int digits = n%10;
      rev = rev*10+digits;
      n=n/10;
    }

    int generate = m-rev;
      System.out.println (generate);
  
  
}
}

// 
