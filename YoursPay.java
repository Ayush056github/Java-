// 
import java.util.Scanner;

public class YoursPay {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int t = n;
    int s = 0;

    
    while (t != 0) {
      int d = t % 10;
      s = s +  d * d * d;
      t = t / 10;
    }

    int i = 0;
    t = n;   

    
    while (t != 0) {
      int d = t % 10;

      if (n == s) {        
        if (d % 2 == 0) {
          i = i + d;
        }
      } else {            
        if (d % 2 != 0) {
          i = i + d;
        }
      }

      t = t / 10;
    }

    System.out.println(i);
  }

  // 
}
