import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- > 0){
            String s = sc.nextLine();
            Stack<Integer> st = new Stack<>();
            
            st.push(-1);
            int max = 0;
            
            for(int i = 0; i < s.length(); i++){
                
                if(s.charAt(i) == '('){
                    st.push(i);
                } 
                else{
                    st.pop();

                    if(st.isEmpty()){
                        st.push(i);
                    }
                    else{
                        max = Math.max(max, i - st.peek());
                    }
                }
            }
            
            System.out.println(max);
        }
    }
}
