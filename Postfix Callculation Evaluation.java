import java.util.*;
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        Stack<Integer> st = new Stack<>();
        
        for(String sl : s.split(" ")){
            
            if(sl.equals("+") || sl.equals("-") || sl.equals("*") || sl.equals("/")){
                
                int b = st.pop();
                int a = st.pop();
                
                if(sl.equals("+")) st.push(a + b);
                else if(sl.equals("-")) st.push(a - b);
                else if(sl.equals("*")) st.push(a * b);
                else st.push(a / b);
                
            }else{
                st.push(Integer.parseInt(sl));
            }
        }
        
        System.out.println(st.pop());
    }
}
