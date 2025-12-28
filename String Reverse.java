// 
import java.util.Scanner;

public class Solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String A = sc.nextLine();

  StringBuilder rev = new StringBuilder(A);
  rev.reverse();

  if(A.equals(rev.toString)){
    System.out.println("Yes");
  }

  else {
    System.out.println("No");
  }
    
