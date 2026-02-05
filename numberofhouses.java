// 
import java.util.*;
import java.util.Scanner;

public class nfh{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        
        
        int[] arr =  new int[n];
        
        for(int i = 0 ; i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println(numberofhouses(r, unit , n, arr));
    }
    public static int numberofhouses(int r , int unit , int n , int arr[]){
        
        if(arr == null || n == 0)
        return -1;
        
        int foodpresent = r*unit;
        int fsum = 0 ;
        
        for(int i =0;i<n;i++){
            fsum+=arr[i];
            
        if(fsum>=foodpresent){
            return  i+1;
        }
            
            
        }
        return 0;
    }
}
