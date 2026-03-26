// 
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        String email = sc.nextLine();

        int first = email.indexOf('@');

        String last = email.substring(first);

        String s = "";
        for(int i = 0; i < first; i++){
            s += "*";
        }

        System.out.println(s + last);
    }
}
// 
