// 
import java.util.*;
import java.util.Scanner;

public class matrixsort{
    public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    int  m = sc.nextInt();
    int n  = sc.nextInt();
    
    int[][] matrix = new int [m][n];
    
    
    
    for(int i =0;i<m;i++){
        for(int j = 0;j<n;j++){
            matrix[i][j]=sc.nextInt();
            
        }
        Arrays.sort(matrix[i]);
    }
    for(int i = 0;i<m;i++){
        for(int j=0;j<n;j++){
            if(j>0)System.out.print("");
            System.out.print(matrix[i][j]);
        }
        System.out.println();
    }
}
}
