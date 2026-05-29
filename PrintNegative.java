// 
import java.util.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of an Arrays:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the Size of an Elments:");
    for(int i = 0 ; i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i =0;i<n;i++){
      if(arr[i]<0)System..out.println(arr[i]+" ");
    }
  }
}
