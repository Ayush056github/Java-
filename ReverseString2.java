// 
import java.util.*;

class Main{
    public static void main(String[] args){
        
        String s = "Ayush Mathur";
        
        
       
        StringBuilder sb = new StringBuilder(s);
        
        // sb.reverse();    Easy Method rehta but kuch time ke liye nahi 
        
        int  i = 0 ; int j =  s.length() -1 ;
        while(i<=j){
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
            
        }
            
        
        
       System.out.println(sb);
        

        
    }

}
