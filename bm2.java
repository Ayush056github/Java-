// 
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        for(char c : s.toCharArray()) {
            System.out.print(9 - (c - '0'));
        }
    }
}
// 
