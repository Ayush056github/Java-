// 
import java.util.*;
import java.util.Scanner;

public class Main{
  public int MirrorDistance(int n){
    int x = Math.abs(n);
    int y = x ;
    int rev = 0 ;

    while(n>0){
      rev = (rev*10)+(n%10);
      n/=10;

     
    }
     return Math.abs(y-rev);
  }
}
  
  
  
