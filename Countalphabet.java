// 
import java.util.*;
import java.util.Scanner;

public class Main{
  public static  void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    String s = sc.nextLine();

  int count = 0;

  for(int i =0;i<s.length();i++){
    char ch = s.charAt(i);
    
  if(ch>='a' || ch>='A'&& ch<='z' || ch<='Z'){
                count++;
            }
        }
        System.out.println(count);
    }
}
// 
