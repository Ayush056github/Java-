// 
import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,13,14,15,16,17};
        int x = sc.nextInt();
        
        boolean flag = false;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==x){
                flag = true;
                break;
                
            }
        }
        
        if(flag){
    System.out.println("Mil gaya");
}else{
    System.out.println("Nahi Mila");
}
        
    }
}
// 
