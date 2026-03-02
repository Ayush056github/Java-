// 
import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int blocks = 1; 
      while(blocks * 2 <= n){ blocks = blocks * 2; }
      System.out.println(blocks);
    }
}
// 
