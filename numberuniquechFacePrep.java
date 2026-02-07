// 
import java.util.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    System.out.println(numberuniquech(str));
  }
 public static int numberuniquech(String str) {
        if (str == null)
            return -1;

          boolean[] seen = new boolean[26];
        int count = 0;

        for (char c : str.toCharArray()) {
            if (!seen[c - 'a']) {
                seen[c - 'a'] = true;
                count++;
            }
        }
        return count;
    }
}

    
