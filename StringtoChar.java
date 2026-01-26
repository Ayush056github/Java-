// 
import java.util.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.nextLine();

    char[] arr = s.toCharArray();

    for(char i : arr){
      System.out.println(i);
    }
  }
}
    
