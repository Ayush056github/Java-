// 
import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        LinkedList<Integer> even = new LinkedList<>();
        LinkedList<Integer> odd = new LinkedList<>();
        
        for(int i =0;i<n;i++){
            int id = sc.nextInt();
            if(id%2==0){
                even.add(id);
                
            }else{
                odd.add(id);
                
            }
        }
        even.addAll(odd);
        
        for(int id : even){
            System.out.println(id+" ");
        }
    }
}
