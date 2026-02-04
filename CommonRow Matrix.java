// import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] matrix = new int[m][n];
        
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        boolean flag = false;
        
        for(int j= 0;j<n;j++){
            int element = matrix[0][j];
            boolean common = true;
        
        
        for(int i =1;i<m;i++){
            boolean found =false;
        
        
        for(int k =0;k<n;k++){
            if(matrix[i][k] == element)
            found = true;
            break;
        }
        }
        if(!found){
            common = false;
            break;
        }
        }
        if(common){
            System.out.print(element+" ");
            flag = true;
        }
        }
        if(!flag){
            System.out.println("No, its not found common element");
        }
        
        
        
        
        
        
    }

// 
}
