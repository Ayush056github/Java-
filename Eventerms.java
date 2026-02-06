// 
import java.util.*;
import java.util.Scanner;

public class Main{
  public static void main(String[]  args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

  int result ;

  if(N%2==1){
    result = 2*(N/2);
  }else{
    result = (2*((N/2)-1))/2;
  }
    System.out.println(result);
    
  }
}
