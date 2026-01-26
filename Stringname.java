// 
import java.util.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String m = sc.nextLine();
    for(int i = 0 ; i < m.length();i++){
      System.out.println(m.substring(0,i));
    }
  }
}
  
