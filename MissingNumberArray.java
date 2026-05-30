// Missing Array
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        int totalsum = (n+1)*(n+2)/2;
        
        int arraySum = 0;
        
        for(int ele : arr){
            arraySum+= ele;
            
            
        }
        int missingArray =  totalsum - arraySum;
        
        System.out.println(missingArray);
        
    }
}
