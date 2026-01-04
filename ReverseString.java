//  Bhai Isme Kuch Nahi Hai Bas Loop Ko Reverse Kardo --  

import java.util.*;

public class Main{
  public static void main(String[] args){


  String s = "Ayush" ;
  String rev = "";;

  for(int i = s.length()-1;i>=0;i--){
    rev = rev + s.charAt(i);

  }
  System.out.println(rev);
  }
}
