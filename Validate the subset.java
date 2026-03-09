import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int [n];
        
        for(int i =0;i<n;i++){
            A[i]=sc.nextInt();
        }
        int m =  sc.nextInt();
        int[] B = new int [m];
        
        for(int i =0;i<m;i++){
            B[i]=sc.nextInt();
            
        }
        boolean isSubset = true;
        
        for(int i =0;i<n;i++){
            boolean found = false;
        
        
        for(int j =0;j<m;j++){
            if(A[i]==B[j]){
                found = true;
                break;
            }
        }
        if(!found){
            isSubset = false;
            break;
        }
        }
        if(isSubset){
            System.out.println('Y');
            
        }else{
            System.out.println('N');
        }
    
    }
}
