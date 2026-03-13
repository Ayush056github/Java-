// 
import java.util.*;
import java.util.Scanner;

public class Main{
    static int movezeroes(int arr[]){
        
        int index = 0;
        
        for(int i =0;i<arr.length;i++){
             if(arr[i]!=0){
          int temp =  arr[i];
          arr[i]=arr[index];
          arr[index]=temp;
          
            
        
        index++;
    }
    }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        movezeroes(arr);
        for(int  x : arr){
            System.out.print(x+" ");
        }
    }
    
    
}
