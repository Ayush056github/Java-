// 
import java.util.*;
import java.util.Scanner;

public class Main{
  public static void main(String [] args){
    Scanner  sc = new Scanner(System.in);
    String s = sc.nextLine();
  int count = 0;
    int  pcount = 0;
  for(int i = 0 ; i <s.length();i++){
    if(s.charAt(i)=='p'){
      pcount++;
      if(pcount == 3){
        count++;
        pcount = 2;
      }
    }
    else{
      pcount = 0;
    }
  }
    System.out.println(count);
    
  }
}
      
