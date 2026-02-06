// 
import java.util.*;
import java.util.Scanner;

public class Main{
  public static void Reversenumber{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int rev = 0;

    while(n!=0){
      int last = n%10;
      rev =rev*10+last;

    n/=10;
    }
    System.out.println(rev);
  }
}
// 
