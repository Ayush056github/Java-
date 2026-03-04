// 
import java.util.*;

public class Brackets{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++){
            
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            boolean redundant = false;
            
            for(char ch : s.toCharArray()){
                
                if(ch == ')'){
                    
                    boolean operator = false;
                    
                    while(st.peek() != '('){
                        char top = st.pop();
                        
                        if(top=='+' || top=='-' || top=='*' || top=='/')
                            operator = true;
                    }
                    
                    st.pop(); // remove '('
                    
                    if(!operator){
                        redundant = true;
                        break;
                    }
                    
                }
                else{
                    st.push(ch);
                }
            }
            
            if(redundant)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
