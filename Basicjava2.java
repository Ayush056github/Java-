import java.util.Stack;
public class Main {
    public static void main(String[] args){
        Stack <String> st = new Stack<>();
        st.push("Khushi");
        st.push("Preeti");
        st.push("Rishika");
        st.push("Isha");
        st.push("shrishti");
        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.peek());
        
        
    }
}
// 
