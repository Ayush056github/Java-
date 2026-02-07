//
import java.util.*;
import java.util.Scanner;

public class Main{
  public static int reverse(long n){
    int rev = 0;

  while(n!=0){
    rev = rev*10+(n%10);
    n/=10;
  }
    return rev;
  }
  public static boolean isPalindrome(long n){
    return n == reverse(n);
  }
  public static int void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    long n = sc.nextlong();

  while(!isPalindrome){
    n=n+reverse(n);
  }
    System.out.println(n);
  }
}
