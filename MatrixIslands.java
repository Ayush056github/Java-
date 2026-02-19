// 
import java.util.*;
import java.util.Scanner;

public class Mainn{
    static int m ;
    static int n ;
    static int [][]arr;
    
    static void  makesinslands(int i , int j){
        if(i<0||i>=m||j<0||j>=n||arr[i][j]==0)
        return ;
        
        arr[i][j]=0;
        
        makesinslands(i-1,j);
        makesinslands(i+1,j);
        makesinslands(i,j-1);
        makesinslands(i,j+1);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     m = sc.nextInt();
    n = sc.nextInt();
        
        int[][] arr = new int [m][n];
        
        int islands = 0;
        
        
        for(int  i =0;i<m;i++){
            for(int j = 0 ; j <n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i = 0 ; i<m;i++){
            for(int j = 0 ; j<n;j++){
                if(arr[i][j]==1){
                    islands++;
                    makesinslands(i,j);
                }
            }
        }
        System.out.println(islands);
    }
}
