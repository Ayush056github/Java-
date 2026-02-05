// 
import java.util.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  Scanner sc =  new Scanner(System.in);
  int n = sc.nextInt();

System.out.println(findcount(n));
}
public static int(int n){
  int count =0 ;

  for(int i =0;i<=n;i++){
    int num = i;
    

  while(num!=0){
    if(num%10==3){
      count++;
    }
    num/=10;
  }
  }
  return count;
  }
}
}
  
