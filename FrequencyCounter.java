// 
import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       String s =  sc.nextLine();
        
        System.out.println(numbertha(s));
    }
    public static int numbertha(String s ){
        
        if(s==null || s.length()==1 {
            return -1;
        }
        
        int count = 0;
        
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
        
        
        if(ch>='a' && ch<='z'){
            count++;
        }
        }
        return count++;
    }
}
