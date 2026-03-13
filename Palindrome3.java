// 
import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  n =sc.nextInt();
        int[] arr = new int[n];
        
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            boolean  isPalindrome =  true;
            int left = 0;
            int right = n-1;
            
            while(left<right){
                if(arr[left] != arr[right] ){
                   isPalindrome = false;
                   break;
                }
                left++;
                right--;
                
            }
            if(isPalindrome){
                System.out.print(
                    'Y');
                    
            }else{
                System.out.print(
                    'N');
                
            }
        
    }
}
