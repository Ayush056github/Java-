import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = arr[0] ;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max)max = arr[i];
            
            
        }
        System.out.println(max);
        
    }
}
