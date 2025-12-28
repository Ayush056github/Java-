// 
import java.util;
import java.io.*;
import java.text;
import java.regex;

public class Main{
  public static void main(String() args){
    Scanner sc = new Scanner(System.in);
    int linenumber = sc.nextInt();

    while(sc.hasNext()){
      String line = sc.nextLine();
      System.out.println(linenumber+" "+line);
      linenumber++;
    }
  }
}
    
