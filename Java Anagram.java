// 
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        if(a.length() != b.length())return false;
        
        int sum = 0 ;
        
        for (int i = 0; i < a.length(); i++) {
        sum += a.charAt(i);
        sum -= b.charAt(i);
    }
    return sum ==0 ;
    
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
