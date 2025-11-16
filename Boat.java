//

import java.util.*;

public class PassengerWeight{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cap = sc.nextInt();
    int adults =  sc.nextInt();
    int children = sc.nextInt();

  int total =  adult*75 + children*30;

  if(total <= cap )
    System.out.println("Boat is stable");
    else 
    System.out.println("Boat will sink");
  }
}
