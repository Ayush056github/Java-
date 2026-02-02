// 
import java.util.*;
import java.util.Scanner;

public class Pastbook{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String username = sc.nextLine();

    int num = 0;

    for(int i = 0;i<=username.length();i++){
      char ch = username.charAt(i);
      if(ch >= '0' && ch <= '9' ){
        num++;
      }
      
      
    }
    System.out.println(num);
  }
}

// 
