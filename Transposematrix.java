// import java.util.*;
import java.util.Scanner;

public class matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] matrix = new int[m][n];
        
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Matrix:");
        
        for(int i =0 ;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Transpose Matrix:");
        for (int j = 0; j < n; j++) {       
            for (int i = 0; i < m; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
       
    }
}
