// 

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int r = sc.nextInt();
    int h = sc.nextInt();

    double volume = 3.14*r*r*h;

    int result = (int) Math.round(volume);

    System.out.print(result);

    sc.close();
  }
}

// 
