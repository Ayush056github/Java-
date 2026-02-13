// 
import java.util.*;
import java.util.Scanner;

public class checkingpailndromenames{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        if (isPalindrome(s)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        
    }
   public static  boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}
