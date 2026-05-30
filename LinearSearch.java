import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean flag = false;
        
        int target = sc.nextInt();
        
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==target){
                flag = true;
                break;
                
            }
            
        }
        if(flag ==  true){
            System.out.println("Arrays is Present "+flag);
        } else {
            System.out.println("Arrays is Not Present ");
        }
    }
}
