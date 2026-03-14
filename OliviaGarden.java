// 
import java.util.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
            
            
        }
        System.out.println(ovlia(arr,n));
    }
    public static int ovlia(int arr[] ,int n ){
        int sum = 0;
        
        int min = Integer.MAX_VALUE;
        
        for(int i =0;i<n;i++){
            sum+=arr[i];
            min = Math.min(min,arr[i]);
            
        }
        return sum-(n*min);
    }
}
