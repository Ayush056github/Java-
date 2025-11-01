import java.util.*;
public class String2 {
    public static void main(String[] args) {
        // Scanner sc =  new Scanner (System.in);
        String name = "Ayush";
        String  surname =  "Mathur";
        String fullname = name+surname;
        System.out.println("Your Full Name is :"+fullname.length());
        // sc.close();

        for(int i = 0 ; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }

        
    }
    
}
