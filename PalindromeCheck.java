// 

import java.util.Scanner;

public class PalindromeCheck {
  public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);

  System.out.print("Enter a string: ");
  String input = sc.nextLine();

  String str = input.toLowerCase();

    String reversed = new StringBuilder(str).reverse().toString();

    if(str.equals(reversed)){
      System.out.println(input + " is a Palindrome. " );
    } else {
       System.out.println(input + " is NOT a Palindrome.");
        }

      sc.close();
  }
}

  
