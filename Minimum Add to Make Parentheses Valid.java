// 
import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        
        
        for(int i = 0 ; i < str.length();i++){
            char ch = str.charAt(i);
                if(ch=='('){
                    stack.push(ch);
                }else{
                    if(stack.isEmpty() || stack.peek()==')'){
                        stack.push(ch);
                    }else{
                        stack.pop();
                    }
                }
        }
    
    System.out.println(stack.size());
    }
}
// 
