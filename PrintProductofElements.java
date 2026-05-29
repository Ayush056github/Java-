import java.util.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[] arr =  new int[n];
    int mul = 1;
    for(int i = 0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        
      mul*=arr[i];
    }
    System.out.println(mul);
  }
}
