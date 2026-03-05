// 
import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new  int [n];
        
        for(int i  = 0 ; i <n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        

        int p1 = arr[n-1] * arr[n-2] * arr[n-3];
        int p2 = arr[0] * arr[1] * arr[n-1];

        System.out.println(Math.max(p1, p2));
    }
}
