import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Original Array:");
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
         for(int ele : arr){
            System.out.print(ele+" ");
        }
        
        int i = 0 ; int  j = arr.length-1;
        
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            
        }
        System.out.println("\nReversed Array: ");
        for(int ele : arr){
            
            System.out.print(ele+" ");
        }
        
    }
}
