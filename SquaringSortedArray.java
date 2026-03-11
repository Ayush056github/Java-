// 
import java.util.*;
import java.util.Scanner;

public class Main{
    public static void squaresort(int [] arr ){
    
        for(int i =0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        
        
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =  new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Number:");
        for(int num: arr){
            System.out.println(num+" ");
        }
        squaresort(arr);
        System.out.println("After squaring an array sorted Arrays");
        for(int num : arr){
            System.out.println(num+" ");
        }
    }
}
