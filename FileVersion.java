// 
import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
         int max = -1;
         
        for(int i =0;i<n;i++)
        {
            String s =  sc.nextLine();
             
        
       if(s.contains ("_")){
           String [] parts = s.split("_");
               if(parts[0].equals("Files")){
                   int num = Integer.parseInt(parts[1]);
               
               max =  Math.max(max,num);
               }
           }
       }
       System.out.println(max);
    }
}
