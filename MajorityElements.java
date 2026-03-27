// 
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println(majorityelement(arr));
    }
    public static int majorityelement(int[] arr){
        int candidate = 0 ;
        int count = 0 ;
        
        for(int num : arr ){
            if(count == 0){
                candidate = num ;
            }
            if(num == candidate){
                count++;
            }else{
                count--;
            }
        }
         return candidate ;
    }
   
    
}
